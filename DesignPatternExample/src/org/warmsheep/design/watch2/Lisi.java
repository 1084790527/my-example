package org.warmsheep.design.watch2;

/**
 * �۲�����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class Lisi implements ILisi {

	/**
	 * ����������ж�����������ϱ�
	 */
	@Override
	public void update(IHanFeizi hanfeizi,String context) {
		// TODO Auto-generated method stub
		System.out.println("��ص��»�����Ϊ��"+hanfeizi.getName());
		upload(context);
	}

	public void upload(String context){
		System.out.println("����ϱ���"+context);
	}
}
