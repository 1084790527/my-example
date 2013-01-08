package org.warmsheep.design.mediator;

/**
 * �ɹ�����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class Purchase extends Colleague {

	public Purchase(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * �����
	 * @param number
	 */
	public void buyIBMComputer(int number){
		mediator.buyIBMComputer(number);
	}
	
	/**
	 * ���ٲɹ�����
	 */
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}

}
