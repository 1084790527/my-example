package org.warmsheep.design.strategy;

import java.util.List;

/**
 * ������
 * @author Warmsheep
 * @createTime Jan 10, 2013
 * @function 
 * �����࣬����һ�����Ե�����
 *
 */
public class DatabaseManager {
	
	public DatabaseManager(){
	}
	
	public DatabaseManager(IDBManager db){
		this.db = db;
	}

	/**
	 * ����Ĳ��Զ���ѡ��ʹ���������ݿ�
	 */
	private IDBManager db = null;

	public IDBManager getDb() {
		return db;
	}

	public void setDb(IDBManager db) {
		this.db = db;
	}
	
	/**
	 * ����һ������
	 * @param o
	 * @return
	 */
	public boolean add(Object o){
		return db.add(o);
	}
	
	/**
	 * ����һ������
	 * @param o
	 * @return
	 */
	public boolean update(Object o){
		return db.update(o);
	}
	
	/**
	 * ɾ��һ������
	 * @param id
	 * @return
	 */
	public boolean delete(int id){
		return db.delete(id);
	}
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Object> findAll(){
		return db.findAll();
	}
	
	/**
	 * ��ѯһ������
	 * @param id
	 * @return
	 */
	public Object findById(int id){
		return db.findById(id);
	}
}
