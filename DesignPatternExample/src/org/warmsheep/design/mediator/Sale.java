package org.warmsheep.design.mediator;

import java.util.Random;

/**
 * ���۹���
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class Sale extends Colleague {

	public Sale(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ���۵���
	 * @param number
	 */
	public void sellIBMComputer(int number){
		mediator.sellComputer(number);
		System.out.println("����IBM����"+number+"̨");
	}
	
	/**
	 * �����������
	 * @return
	 */
	public int getSaleStatus(){
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ:"+saleStatus);
		return saleStatus;
	}
	
	/**
	 * �ۼ۴���
	 */
	public void offSale(){
		mediator.offSale();
	}

}
