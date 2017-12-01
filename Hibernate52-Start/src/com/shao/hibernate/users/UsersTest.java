package com.shao.hibernate.users;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersTest {
	private static Logger logger = Logger.getLogger(UsersTest.class);
	private Session session = null;
	private SessionFactory sessionFactory = null;

	public Session getSession() {
		// 读取配置文件，创建sessionFactory对象
		sessionFactory = new Configuration().configure().buildSessionFactory();
		// 创建session
		session = sessionFactory.openSession();
		return session;
	}

	// 关闭session
	public void closeSession() {
		if (session != null)
			session.close();
		if (sessionFactory != null)
			sessionFactory.close();

	}

	// 插入数据
	public Long insert(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		Long id = (Long) session.save(users);
		transaction.commit();
		closeSession();
		return id;
	}

	// 更新数据
	public void update(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		session.update(users);
		transaction.commit();
		closeSession();
	}

	// 删除表数据
	public void delete(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		session.delete(users);
		transaction.commit();
		closeSession();
	}

	public Users getUsersByID(Long id) {
		session = getSession();
		Users users = (Users) session.get(Users.class, id);
		closeSession();
		return users;
	} // 获取列表

	@SuppressWarnings("unchecked")
	public List<Users> getUsersList() {
		session = getSession();
		// List<Users> usersList =(List<Users>)session.cancelQuery("from
		// Users").list();旧版本方法！
		List<Users> usersList = (List<Users>) session.createQuery("From Users").getResultList();
		closeSession();
		return usersList;
	}

	public static void main (String[]args) {
    	 UsersTest test=new UsersTest();
    	 Long userId =test.insert(new Users(null,"jack11","jack11"));
    	 logger.info(userId);
    	 logger.info(test.getUsersByID(userId));
    	 
    	 
    	 
//    	 Users users=new Users();
//    	 users.setId(6L);
    	 List<Users> usersList=test.getUsersList();
    	 for(Users users1:usersList) {
    		logger.info(users1);
    	 }
     }

}
