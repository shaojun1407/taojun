package com.ddb.hibernate.inherit.unionsubclass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.util.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.insertData();
		test.findPerson();
		test.findEmployee();
		test.findCustomer();
	}

	private void insertData() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = new Person();
		person1.setPersonName("Jack");
		session.save(person1);
		Person person2 = new Person();
		person2.setPersonName("Tom");
		session.save(person2);

		Employee emp1 = new Employee();
		emp1.setPersonName("Mike");
		emp1.setJob("Salesman");
		session.save(emp1);
		Employee emp2 = new Employee();
		emp2.setPersonName("King");
		emp2.setJob("Manager");
		session.save(emp2);

		Customer cus1 = new Customer();
		cus1.setPersonName("Rose");
		cus1.setComment("Very Good!");
		session.save(cus1);
		Customer cus2 = new Customer();
		cus2.setPersonName("Annie");
		cus2.setComment("Very Bad!");
		session.save(cus2);

		tx.commit();
		HibernateUtil.closeSession();
	}

	@SuppressWarnings("unchecked")
	private void findPerson() {
		Session session = HibernateUtil.getSession();

		List<Person> persons = (List<Person>) session.createQuery(
				"select new Person(p.personId,p.personName) from Person as p")
				.getResultList();
		for (Person person : persons) {
			System.out.println(person);
		}

		HibernateUtil.closeSession();
	}

	@SuppressWarnings("unchecked")
	private void findEmployee() {
		Session session = HibernateUtil.getSession();

		List<Employee> employees = (List<Employee>) session.createQuery(
				"select new Employee(e.personId,e.personName,e.job) from Employee as e")
				.getResultList();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		HibernateUtil.closeSession();
	}
	
	@SuppressWarnings("unchecked")
	private void findCustomer() {
		Session session = HibernateUtil.getSession();

		List<Customer> customers = (List<Customer>) session.createQuery(
				"select new Customer(c.personId,c.personName,c.comment) from Customer as c")
				.getResultList();
		for (Customer cus : customers) {
			System.out.println(cus);
		}

		HibernateUtil.closeSession();
	}

}
