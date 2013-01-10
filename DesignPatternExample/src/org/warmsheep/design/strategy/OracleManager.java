package org.warmsheep.design.strategy;

import java.util.List;

/**
 * Oracle���ݿ���Ե�ʵ����
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *
 */
public class OracleManager implements IDBManager{

	@Override
	public boolean add(Object o) {
		System.out.println("Oracle���ݿ��������");
		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Oracle���ݿ�ɾ������");
		return true;
	}

	@Override
	public boolean update(Object o) {
		System.out.println("Oracle���ݿ��������");
		return false;
	}

	@Override
	public List<Object> findAll() {
		System.out.println("Oracle���ݿ������������");
		return null;
	}

	@Override
	public Object findById(int id) {
		System.out.println("Oracle���ݿ��������");
		return null;
	}

}
