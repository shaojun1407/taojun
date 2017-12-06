package com.ddb.hibernate.relation.many_one.singleonemany;



import java.util.HashSet;
import java.util.Set;

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
		test.addressNavigation();
	}
	
	
	
	private void insertData(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Person p2 = new Person();
		p2.setPersonName("Rose");
		Person p1 = new Person();
		p1.setPersonName("Jack");
		
		Set<Person> persons=new HashSet<Person>();
		persons.add(p1);
		persons.add(p2);
		
		Address address=new Address();
		address.setAddressName("CHINA");
		address.setPersons(persons);
		
		session.save(address);

		tx.commit();
		HibernateUtil.closeSession();
	}
	
	
	private void addressNavigation(){
		Session session=HibernateUtil.getSession();
		
		Address address=(Address)session.load(Address.class, new Long(1));
		System.out.println(address);
		
		Set<Person> persons =address.getPersons();
		for(Person person :persons){
			System.out.println(person);
		}
		
		HibernateUtil.closeSession();
	}

}
