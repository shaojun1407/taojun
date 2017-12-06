package com.ddb.hibernate.relation.cascade;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.util.HibernateUtil;

@SuppressWarnings("unused")
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test=new Test();
		/**
		 * N端级联插入:必须打开级联更新，否则将插入失败
		 */
		test.personCascadeSave();
		/**
		 * 1端级联插入:必须打开级联更新，否则将插入失败
		 */
		//test.addressCascadeSave();
		
		/**
		 * N端级联更新
		 */
		//test.saveData();
		//test.personCascadeUpdate();
		
		/**
		 * 1端级联更新
		 */
		//test.saveData();
		//test.addressCascadeUpdate();
		/**
		 * N端级联删除
		 */
		//test.saveData();
		//test.personCascadeDelete();
		/**
		 * 1端级联删除
		 */
		//test.saveData();
		//test.addressCascadeDelete();
	}
	
	private void saveData(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		session.save(address);
		
		Person person1 = new Person();
		person1.setPersonName("Jack");
		
		
		Person person2 = new Person();
		person2.setPersonName("Rose");
		
		//维护关联关系
		person1.setAddress(address);
		person2.setAddress(address);
		
		session.save(person1);
		session.save(person2);

		tx.commit();
		HibernateUtil.closeSession();
	}
	
	/**
	 * N端级联插入
	 */
	private void personCascadeSave(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		
		Person person1 = new Person();
		person1.setPersonName("Jack");
		
		
		Person person2 = new Person();
		person2.setPersonName("Rose");
		
		//设置级联操作实体（同时也设置了实体的关联关系）
		person1.setAddress(address);
		person2.setAddress(address);
		
		//级联插入
		session.save(person1);
		session.save(person2);

		tx.commit();
		HibernateUtil.closeSession();
	}
	/**
	 * 1端级联插入
	 */
	private void addressCascadeSave(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		
		Person person1 = new Person();
		person1.setPersonName("Jack");
		
		Person person2 = new Person();
		person2.setPersonName("Rose");
		
		//设置级联操作实体（inverse="false"的时候也同时设置了实体的关联关系）
		address.getPersons().add(person1);
		address.getPersons().add(person2);
		
		//插入操作
		session.save(address);
		
		tx.commit();
		HibernateUtil.closeSession();
	}
	/**
	 * N端级联更新
	 */
	private void personCascadeUpdate(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		address.setAddressName("New_CHINA");

		Person person1=(Person)session.get(Person.class, new Long(1));
		person1.setPersonName("New_Jack");

		Person person2=(Person)session.get(Person.class, new Long(2));
		person2.setPersonName("New_Rose");

		person1.setAddress(address);
		person2.setAddress(address);
		
		session.evict(address);
		session.evict(person1);
		session.evict(person2);
		
		//更新操作
		session.update(person1);
		session.update(person2);	

		tx.commit();
		HibernateUtil.closeSession();
	}
	/**
	 * 1端级联更新
	 */
	private void addressCascadeUpdate(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		address.setAddressName("New_CHINA");

		Person person1=(Person)session.get(Person.class, new Long(1));
		person1.setPersonName("New_Jack");

		Person person2=(Person)session.get(Person.class, new Long(2));
		person2.setPersonName("New_Rose");

		address.getPersons().add(person1);
		address.getPersons().add(person2);
		
		session.evict(address);
		session.evict(person1);
		session.evict(person2);
		
		//更新操作
		session.update(address);		

		tx.commit();
		HibernateUtil.closeSession();
	}
	/**
	 * N端级联删除
	 */
	private void personCascadeDelete(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		address.setAddressName("New_CHINA");

		Person person1=(Person)session.get(Person.class, new Long(1));
		person1.setPersonName("New_Jack");

		Person person2=(Person)session.get(Person.class, new Long(2));
		person2.setPersonName("New_Rose");

		person1.setAddress(address);
		person2.setAddress(address);
		
		session.evict(address);
		session.evict(person1);
		session.evict(person2);
		
		//删除操作
		session.update(person1);
		session.update(person2);
		session.delete(person1);
		session.delete(person2);	

		tx.commit();
		HibernateUtil.closeSession();
	}
	/**
	 * 1端级联删除
	 */
	private void addressCascadeDelete(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		address.setAddressName("New_CHINA");

		Person person1=(Person)session.get(Person.class, new Long(1));
		person1.setPersonName("New_Jack");

		Person person2=(Person)session.get(Person.class, new Long(2));
		person2.setPersonName("New_Rose");
		
		address.getPersons().add(person1);
		address.getPersons().add(person2);
		
		session.evict(address);
		session.evict(person1);
		session.evict(person2);
		
		//删除操作
		session.update(address);
		session.delete(address);	

		tx.commit();
		HibernateUtil.closeSession();
	}

}
