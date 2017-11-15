package com.logo.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * BaseDao zhou
 * @author Administrator
 *
 */
public class BaseDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
}
