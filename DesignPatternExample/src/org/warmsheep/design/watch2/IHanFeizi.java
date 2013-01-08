package org.warmsheep.design.watch2;

/**
 * ���۲���
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public interface IHanFeizi {
	
	/**
	 * ���緹
	 */
	void hasBreakFast();
	
	/**
	 * ����һ���۲���
	 * @param o
	 */
	void addObserver(ILisi o);
	
	/**
	 * ɾ��һ���۲���
	 * @param o
	 */
	void delObserver(ILisi o);
	
	/**
	 * ֪ͨ�۲���
	 */
	void notifyObservers(String context);
	
	
	String getName();
}
