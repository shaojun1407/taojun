package com.ddb.hibernate.relation.one_one.primaryboth;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.util.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test=new Test();
		test.insertData();
		test.personNavigation();
		test.addressNavigation();
	}

	private void insertData(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		//session.save(address);
		
		Person person = new Person();
		person.setPersonName("Jack");
		person.setAddress(address);
		session.save(person);

		tx.commit();
		HibernateUtil.closeSession();
	}
	
	private void personNavigation(){
		Session session=HibernateUtil.getSession();
		
		Person person=(Person)session.load(Person.class, new Long(1));
		System.out.println(person);
		
		Address address=person.getAddress();
		System.out.println(address);
		
		HibernateUtil.closeSession();
	}
	
	private void addressNavigation(){
		Session session=HibernateUtil.getSession();
		
		Address address=(Address)session.load(Address.class, new Long(1));
		System.out.println(address);
		
		Person person=address.getPerson();
		System.out.println(person);
		
		HibernateUtil.closeSession();
	}
	

}
