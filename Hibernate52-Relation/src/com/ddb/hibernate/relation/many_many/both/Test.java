package com.ddb.hibernate.relation.many_many.both;



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
		test.personNavigation();
	}
	
	
	
	private void insertData(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Person person1 = new Person();
		person1.setPersonName("Jack");
		Person person2 = new Person();
		person2.setPersonName("Rose");
		
		Address address1=new Address();
		address1.setAddressName("CHINA");
		Address address2=new Address();
		address2.setAddressName("JAPAN");
		Set<Person> persons=new HashSet<Person>();
		persons.add(person1);
		persons.add(person2);
		
		address1.setPersons(persons);
		address2.setPersons(persons);
		
		session.save(address1);
		session.save(address2);

		tx.commit();
		HibernateUtil.closeSession();
	}
	
	private void addressNavigation(){
		Session session=HibernateUtil.getSession();
		
		Address address=(Address)session.load(Address.class, new Long(1));
		System.out.println(address);
		
		Set<Person> persons=address.getPersons();
		for(Person person : persons){
			System.out.println(person);
		}
		
		HibernateUtil.closeSession();
	}
	
	private void personNavigation(){
		Session session=HibernateUtil.getSession();
		
		Person person=(Person)session.load(Person.class, new Long(1));
		System.out.println(person);
		
		Set<Address> addresses=person.getAddresses();
		for(Address address : addresses){
			System.out.println(address);
		}
		
		HibernateUtil.closeSession();
	}
	
	
}
