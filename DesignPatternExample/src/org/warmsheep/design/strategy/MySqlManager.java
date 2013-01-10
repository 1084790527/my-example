package org.warmsheep.design.strategy;

import java.util.List;

/**
 * MySql���ݿ���Ե�ʵ����
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class MySqlManager implements IDBManager{

	@Override
	public boolean add(Object o) {
		System.out.println("MySql���ݿ��������");
		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("MySql���ݿ�ɾ������");
		return true;
	}

	@Override
	public boolean update(Object o) {
		System.out.println("MySql���ݿ��������");
		return false;
	}

	@Override
	public List<Object> findAll() {
		System.out.println("MySql���ݿ������������");
		return null;
	}

	@Override
	public Object findById(int id) {
		System.out.println("MySql���ݿ��������");
		return null;
	}

}
