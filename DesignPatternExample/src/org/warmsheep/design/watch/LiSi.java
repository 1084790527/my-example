package org.warmsheep.design.watch;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲�����
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function 
 *
 */
public class LiSi implements Observer{

	@Override
	public void update(Observable observable,Object obj) {
		// TODO Auto-generated method stub
		System.out.println("�۲쵽�µĻ��"+obj.toString());
		upload(obj.toString());
	}
	
	public void upload(String msg){
		System.out.println("�ϱ����ݣ�"+msg);
	}

}
