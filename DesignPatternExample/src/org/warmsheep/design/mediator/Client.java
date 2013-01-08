package org.warmsheep.design.mediator;

/**
 * �ͻ���������
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Purchase purchase = new Purchase(mediator);
		Sale sale = new Sale(mediator);
		Stock stock = new Stock(mediator);
		
		
		mediator.setPurchase(purchase);
		mediator.setSale(sale);
		mediator.setStock(stock);
		
		System.out.println("-----------�ɹ���Ա�ɹ�����-------------");
		purchase.buyIBMComputer(100);
		System.out.println("-----------������Ա���۵���-------------");
		sale.sellIBMComputer(1);
		System.out.println("------------�ⷿ��Ա������-------------");
		stock.clearStock();
	}
}
