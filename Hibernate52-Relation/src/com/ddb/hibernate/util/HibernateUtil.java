package com.ddb.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session session = null;
	public static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	/**
	 * 获取session
	 * 
	 * @return
	 */
	public static Session getSession() {
		session = sessionFactory.openSession();
		return session;
	}

	/**
	 * 关闭session
	 */
	public static void closeSession() {
		if (session != null)
			session.close();
	}
}