package org.warmsheep.design.state;

/**
 * ������
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class UserManager {

	private IUserOpt userOpt = null;
	//�������״̬��ֵ
	public static final int ADMIN = 0;
	public static final int USER = 1;
	
	public void login(String name,String password){
		//ͨ����̬��ȡ״̬��ʵ������ͬ�����
		int state = getState(name);
		if(state == ADMIN){
			userOpt = new AdminOpt();
		}else if(state == USER){
			userOpt = new UserOpt();
		}
		userOpt.login(name, password);
	}
	
	private int getState(String userName){
		System.out.println("�����ݿ�ȡ�ø��û������״̬");
		return ADMIN;
	}
}
