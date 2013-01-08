package org.warmsheep.design.watch2;

import java.util.Vector;
/**
 * ���۲�����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 * Vector�ǻ����̰߳�ȫ�ģ�����������̰߳�ȫ��Ϊ�۲��߼��϶���
 * �ڽ��л��ʱ�����notifyObserversȥ֪ͨ���еĹ۲��ߡ�
 * ���л֮ǰ��Ӧ�õ���addObserverȥ����Ҫ�۲�Ķ�����뵽������
 *
 */
public class HanFeiZi implements IHanFeizi {

	private Vector<ILisi> observer = new Vector<ILisi>();	//�۲��߶����б�
	private String name = "������";
	
	@Override
	public void hasBreakFast() {
		notifyObservers("�����ӳԷ���");
	}

	@Override
	public void addObserver(ILisi o) {
		observer.add(o);
	}

	@Override
	public void delObserver(ILisi o) {
		observer.remove(o);
	}

	@Override
	public void notifyObservers(String context) {
		for(ILisi o : observer){
			o.update(this,context);
		}
	}
	
	/*
	 * Getter and Setter
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
