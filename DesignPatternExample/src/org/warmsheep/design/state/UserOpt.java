package org.warmsheep.design.state;

/**
 * ��ͨ�û�״̬
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class UserOpt implements IUserOpt{

	@Override
	public boolean login(String userName, String password) {
		System.out.println("��ͨ�û���¼����ת����ҳ");
		return false;
	}

	@Override
	public boolean submit() {
		System.out.println("��ͨ�û��ύ");
		return false;
	}

}
