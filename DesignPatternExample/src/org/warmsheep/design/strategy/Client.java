package org.warmsheep.design.strategy;

/**
 * �ͻ���
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//��new��ָ������Ĳ��Զ���ִ�ж�Oracle���ݵĲ�����
		DatabaseManager db = new DatabaseManager(new OracleManager());
		
		db.add(new Object());
		db.update(new Object());
		db.delete(0);
	}

}
