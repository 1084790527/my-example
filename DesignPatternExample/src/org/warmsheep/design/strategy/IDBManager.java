package org.warmsheep.design.strategy;

import java.util.List;

/**
 * ���ԵĽӿ�
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 *	������������ʵ�ֵĽӿ�
 */
public interface IDBManager {

	boolean add(Object o);
	
	boolean delete(int id);
	
	boolean update(Object o);
	
	List<Object> findAll();
	
	Object findById(int id);
}
