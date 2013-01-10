package org.warmsheep.design.strategy;

import java.util.List;

/**
 * SqlServer���ݿ��ʵ����
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class SqlServerManager implements IDBManager{

	@Override
	public boolean add(Object o) {
		System.out.println("SqlServer���ݿ��������");
		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("SqlServer���ݿ�ɾ������");
		return true;
	}

	@Override
	public boolean update(Object o) {
		System.out.println("SqlServer���ݿ��������");
		return false;
	}

	@Override
	public List<Object> findAll() {
		System.out.println("SqlServer���ݿ������������");
		return null;
	}

	@Override
	public Object findById(int id) {
		System.out.println("SqlServer���ݿ��������");
		return null;
	}

}
