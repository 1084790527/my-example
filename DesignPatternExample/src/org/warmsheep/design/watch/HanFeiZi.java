package org.warmsheep.design.watch;

import java.util.Observable;

/**
 * ������
 * @author Warmsheep
 * @createTime Jan 7, 2013
 * @function ���۲���
 * �̳�Observable�����۲��ߣ���
 *
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

	@Override
	public void havebreakFast() {
		// TODO Auto-generated method stub
		super.setChanged();
		super.notifyObservers("�ҳԷ���");
	}
	
	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		super.setChanged();
		super.notifyObservers("��������");
	}

	@Override
	public void havebreakFast(boolean isnotifyObj) {
		// TODO Auto-generated method stub
		if(isnotifyObj){
			super.setChanged();
			super.notifyObservers("�ҳԷ���");
		}
	}

	@Override
	public void haveFun(boolean isnotifyObj) {
		// TODO Auto-generated method stub
		if(isnotifyObj){
			super.setChanged();
			super.notifyObservers("��������");
		}
	}

}
