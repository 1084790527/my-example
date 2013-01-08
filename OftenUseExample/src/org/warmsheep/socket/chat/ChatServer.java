package org.warmsheep.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Vector;

/**
 * ���������ҷ����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class ChatServer {
	
	private static Vector<ServerThread> m_threads = new Vector<ServerThread>();
	
	public ChatServer(){
	}
	
	public void start(){
		ServerSocket socket = null;
		System.out.println("�����������������ڵȴ��ͻ�������...");
		try {
			// ����Server�����˿ں�Ϊ8888, ������ֱ���
			// �ͳ���ChatClient�е�port����һ�¡�
			socket = new ServerSocket(8888);
		} catch (Exception e) {
			System.out.println("����ӿڽ���ʧ��!");
			return;
		}
		try {
			int nid = 0;
			while (true) {
				// �����Ƿ�����Chat Applet���ӵ�Server,
				// �߳����е������������ֱ�����µ����Ӳ�����
				Socket s = socket.accept();
				// ����һ���µ�ServerThread.
				ServerThread st = new ServerThread(s);
				// Ϊ���߳�����һ��ID�š�
				st.setID(nid++);
				// �����̼߳��뵽m_threads Vector�С�
				m_threads.addElement(st);
				// ���������̡߳�
				new Thread(st).start();
				// ֪ͨ����Chat Applet��һ���µ����Ѽ��롣
				for (int i = 0; i < m_threads.size(); i++) {
					ServerThread st1 = (ServerThread) m_threads.elementAt(i);
					st1.write("<������>��ӭ " + st.getID() + "�����ѽ���������!");
				}
				System.out.println("����" + st.getID() + "�ſͻ�����");
				System.out.println("�����ȴ������ͻ�������...\n");
			}
		} catch (Exception e) {
			System.out.println("�������ѹر�...");
		}
	}
	
	/*
	 * �����̣߳�������Ӧ��Chat Applet�Ƿ�����Ϣ������
	 */
	private final class ServerThread implements Runnable {
		Socket m_socket = null;
		DataInputStream m_in = null;
		DataOutputStream m_out = null;
		int m_nid;

		// ��ʼ�����̡߳�
		public ServerThread(Socket s) {
			m_socket = s;
			try {
				m_in = new DataInputStream(m_socket.getInputStream());
				m_out = new DataOutputStream(m_socket.getOutputStream());
			} catch (Exception e) {
			}
		}

		public void run()
		{
			System.out.println("�ȴ�������������");
			try {
				while (true) {
					// ������Ӧ��Applet�Ƿ�����Ϣ
					// �������뵽m_in.readUTF()�У�ֱ������Ϣ�����ŷ��ء�
					String s = m_in.readUTF();
					if (s == null)
						break;
					// ���Chat Applet��������ϢΪ"leave",
					// ��֪ͨ���������ĵ�Chat Applet�Լ��˳��ˡ�
					if (s.trim().equals("leave"))
						for (int i = 0; i < m_threads.size(); i++) {
							ServerThread st = (ServerThread) m_threads.elementAt(i);
							st.write("*��λ���ѣ� " + getID() + "�������뿪������" + "��*");
						}
					else
						// ������Chat Applet�㲥����Ϣ��
						for (int i = 0; i < m_threads.size(); i++) {
							ServerThread st = (ServerThread) m_threads.elementAt(i);
							st.write("<" + getID() + "����˵>" + s);
						}
				}
			} catch (SocketException e) {
				System.out.println(getID() + "�������뿪������" + "��*");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			// ��m_threads Vector��ɾ�����̣߳���ʾ���߳��Ѿ��뿪�����ҡ�
			m_threads.removeElement(this);
			try {
				m_socket.close();
			} catch (Exception e) {
			}
		}

		// ��msg�ͻض�Ӧ��Applet
		public void write(String msg) {
			synchronized (m_out) {
				try {
					m_out.writeUTF(msg);
				} catch (IOException e) {
				}
			}
		}

		public int getID() // ��ø��̵߳�ID.
		{
			return m_nid;
		}

		public void setID(int nid) // //�����̵߳�ID.
		{
			m_nid = nid;
		}
	}
}


