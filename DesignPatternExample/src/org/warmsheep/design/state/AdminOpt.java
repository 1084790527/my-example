package org.warmsheep.design.state;

public class AdminOpt implements IUserOpt {

	@Override
	public boolean login(String userName, String password) {
		System.out.println("����Ա��¼�ɹ�����ת����̨");
		return false;
	}

	@Override
	public boolean submit() {
		System.out.println("����Ա�ύ");
		return false;
	}

}
