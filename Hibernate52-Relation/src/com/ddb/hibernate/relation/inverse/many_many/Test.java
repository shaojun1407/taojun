package com.ddb.hibernate.relation.inverse.many_many;

/**
 * N-N关联关系维护
 * 默认情况下两端都可以维护关联关系
 */

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.util.HibernateUtil;

@SuppressWarnings("unused")
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		/**
		 * 添加关系测试1
		 */
		//test.insertDataWithoutRelation();
		//test.addRelationWithPerson();

		/**
		 * 添加关系测试2
		 */
		 //test.insertDataWithoutRelation();
		// test.addRelationWithAddress();
		/**
		 * 删除关系测试1
		 */
		// test.insertDataWithRelation();
		// test.removeRelationWithPerson();
		/**
		 * 删除关系测试2
		 */
		 test.insertDataWithRelation();
		 test.removeRelationWithAddress();
	}

	/**
	 * 插入数据：无关联关系
	 */
	private void insertDataWithoutRelation() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = new Person();
		person1.setPersonName("Jack");
		Person person2 = new Person();
		person2.setPersonName("Rose");
		session.save(person1);
		session.save(person2);

		Address address1 = new Address();
		address1.setAddressName("CHINA");
		Address address2 = new Address();
		address2.setAddressName("JAPAN");
		session.save(address1);
		session.save(address2);

		tx.commit();
		HibernateUtil.closeSession();
	}

	/**
	 * 添加关联关系：Person维护并插入关联关系
	 */
	private void addRelationWithPerson() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = (Person) session.get(Person.class, new Long(1));
		Person person2 = (Person) session.get(Person.class, new Long(2));
		Address address1 = (Address) session.get(Address.class, new Long(1));
		Address address2 = (Address) session.get(Address.class, new Long(2));
		// 维护关联关系
		person1.getAddresses().add(address1);
		person1.getAddresses().add(address2);
		person2.getAddresses().add(address1);
		person2.getAddresses().add(address2);

		tx.commit();
		HibernateUtil.closeSession();
	}

	/**
	 * 添加关联关系：Address维护并插入关联关系
	 */
	private void addRelationWithAddress() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = (Person) session.get(Person.class, new Long(1));
		Person person2 = (Person) session.get(Person.class, new Long(2));
		Address address1 = (Address) session.get(Address.class, new Long(1));
		Address address2 = (Address) session.get(Address.class, new Long(2));
		// 维护关联关系
		address1.getPersons().add(person1);
		address1.getPersons().add(person2);
		address2.getPersons().add(person1);
		address2.getPersons().add(person2);

		tx.commit();
		HibernateUtil.closeSession();
	}

	/**
	 * 插入数据：有关联关系，通过Address端插入关联关系
	 */
	private void insertDataWithRelation() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = new Person();
		person1.setPersonName("Jack");
		Person person2 = new Person();
		person2.setPersonName("Rose");
		session.save(person1);
		session.save(person2);

		Address address1 = new Address();
		address1.setAddressName("CHINA");
		// 维护关联关系
		address1.getPersons().add(person1);
		address1.getPersons().add(person2);
		session.save(address1);

		Address address2 = new Address();
		address2.setAddressName("JAPAN");
		// 维护关联关系
		address2.getPersons().add(person1);
		address2.getPersons().add(person2);
		session.save(address2);

		tx.commit();
		HibernateUtil.closeSession();
	}

	/**
	 * 删除关联关系：Person维护并删除关联关系
	 */
	private void removeRelationWithPerson() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = (Person) session.get(Person.class, new Long(1));
		Person person2 = (Person) session.get(Person.class, new Long(2));
		// 维护关联关系
		person1.getAddresses().clear();
		person2.getAddresses().clear();

		tx.commit();
		HibernateUtil.closeSession();
	}

	/**
	 * 删除关联关系：Address维护并删除关联关系
	 */
	private void removeRelationWithAddress() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Address address1 = (Address) session.get(Address.class, new Long(1));
		Address address2 = (Address) session.get(Address.class, new Long(2));
		// 维护关联关系
		address1.getPersons().clear();
		address2.getPersons().clear();

		tx.commit();
		HibernateUtil.closeSession();
	}

}
