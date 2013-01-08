package org.warmsheep.design.mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void clearStock() {
		//��Ҫ�ٲɹ���
				super.purchase.refuseBuyIBM();
		//����ۼ�����
		super.sale.offSale();
		
	}

	@Override
	public void offSale() {
		// TODO Auto-generated method stub
		System.out.println("�ۼ�����IBM����:"+stock.getStockNumber()+"̨");
		super.stock.decrease(stock.getStockNumber());
	}

	@Override
	public void buyIBMComputer(int number) {
		// TODO Auto-generated method stub
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus > 80) //�����������
		{
			System.out.println("�ɹ�IBM����:"+number+"̨");
			super.stock.increase(number);
		}else {
			int buyNumber = number/2;	//�۰�ɹ�
			System.out.println("�ɹ�IBM����:"+buyNumber + "̨");
			super.stock.increase(buyNumber);
		}
	}

	@Override
	public void sellComputer(int number) {
		// TODO Auto-generated method stub
		//�����������
		if(super.stock.getStockNumber() < number){
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}

}
