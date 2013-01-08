package org.warmsheep.design.mediator;

/**
 * ������н�����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public abstract class Mediator {

	//����ͬ����
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	//ͨ��Setter��ע��ͬ����
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	/**
	 * ���
	 */
	public abstract void clearStock();
	
	/**
	 * �ۼ۴���
	 */
	public abstract void offSale();
	
	/**
	 * �ɹ�����
	 */
	public abstract void buyIBMComputer(int number);
	
	/**
	 * ���۵���
	 * @param number
	 */
	public abstract void sellComputer(int number);
}
