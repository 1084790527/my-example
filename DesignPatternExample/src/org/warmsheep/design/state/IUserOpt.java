package org.warmsheep.design.state;

/**
 * ״̬�ĳ���ӿ�
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public interface IUserOpt {

	boolean login(String userName,String password);
	
	boolean submit();
}
