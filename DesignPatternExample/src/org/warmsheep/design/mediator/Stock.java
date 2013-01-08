package org.warmsheep.design.mediator;

/**
 * ������
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class Stock extends Colleague{

	public Stock(Mediator mediator) {
		super(mediator);
	}
	
	private static int COMPUTER_NUMBER = 100;
	
	/**
	 * �������
	 * @param number
	 */
	public void increase(int number){
		COMPUTER_NUMBER +=  number;
		System.out.println("�������Ϊ:"+COMPUTER_NUMBER);
	}
	
	/**
	 * ������
	 * @param number
	 */
	public void decrease(int number){
		COMPUTER_NUMBER -= number;
		System.out.println("�������Ϊ��"+COMPUTER_NUMBER);
	}
	
	/**
	 * ��ÿ������
	 * @return
	 */
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	
	/**
	 * ���
	 */
	public void clearStock(){
		System.out.println("��Ҫ����Ĵ������Ϊ��"+COMPUTER_NUMBER);
		mediator.clearStock();
	}

}
