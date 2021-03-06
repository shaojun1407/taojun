package com.ddb.hibernate.relation.many_one.singlemanyone;



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
	}
	
	
	
	private void insertData(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		
		Person p1 = new Person();
		p1.setPersonName("Jack");
		p1.setAddress(address);
		
		
		Person p2 = new Person();
		p2.setPersonName("Rose");
		p2.setAddress(address);
		
		session.save(p1);
		session.save(p2);

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
}
