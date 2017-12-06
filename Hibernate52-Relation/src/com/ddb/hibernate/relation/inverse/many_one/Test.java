package com.ddb.hibernate.relation.inverse.many_one;

/**
 * N-1关联关系的维护
 * 
 * N端：始终可以维护实体间的关联关系
 * 因为N的一端对应的数据库表中拥有体现关联关系的外键列
 * 
 * 1端：通过inverse属性设置是否维护实体间的关联关系
 * 默认情况下集合的inverse="false"能够维护实体关联关系
 * 
 * N端维护与1端维护的差异
 * 因为1的一端对应的数据库表没有体现关联关系的外键列，
 * 所以在维护关联关系的时候会多出不必要的update语句，
 * N的一端维护则不会，所以通常在1端设置inverse="false"
 * 
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
		Test test=new Test();
		
		/**
		 * 添加关系测试1：N端维护
		 * 先插入无关联关系的数据，再通过N端添加关联关系
		 */
		//test.insertDataWithoutRelation();
		//test.addRelationWithPerson();
		/**
		 * 添加关系测试2：1端维护
		 * 先插入无关联关系的数据，再通过1端添加关联关系
		 */
		test.insertDataWithoutRelation();
		test.addRelationWithAddress();
		
		/**
		 * 删除关系测试1：N端维护
		 * 先插入有关联关系的数据，再通过N端移除关联关系
		 */
		//test.insertDataWithRelation_N();
		//test.removeRelationWithPerson();
		/**
		 * 删除关系测试2：1端维护
		 * 先插入有关联关系的数据，再通过1端移除关联关系
		 */
		//test.insertDataWithRelation_N();
		//test.removeRelationWithAddress();
		
		/**
		 * N端维护与1端维护的比较1:N端插入数据
		 */
		//test.insertDataWithRelation_N();
		/**
		 * N端维护与1端维护的比较1:1端插入数据
		 * 差异：1端维护时会多出很多update语句
		 */
		//test.insertDataWithRelation_1();
		/**
		 * N端维护与1端维护的比较3:N端删除数据
		 */
		//test.insertDataWithRelation_N();
		//test.deleteDateWithRelation_N();
		/**
		 * N端维护与1端维护的比较4:1端删除数据
		 * 差异：1端维护时会多出很多update语句
		 */
		//test.insertDataWithRelation_N();
		//test.deleteDateWithRelation_1();
		
	}
	/**
	 * 插入数据:不插入数据的关联关系
	 */
	private void insertDataWithoutRelation(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=new Address();
		address.setAddressName("CHINA");
		session.save(address);
		
		Person p1 = new Person();
		p1.setPersonName("Jack");
		session.save(p1);
		
		Person p2 = new Person();
		p2.setPersonName("Rose");
		session.save(p2);

		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	/**
	 * 插入数据:通过N端添加数据的关联关系
	 */
	private void insertDataWithRelation_N(){
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
		System.out.println("=============================================");
	}
	/**
	 * 插入数据:通过1端添加数据的关联关系
	 */
	private void insertDataWithRelation_1(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person person1 = new Person();
		person1.setPersonName("Jack");
		session.save(person1);
		
		Person person2 = new Person();
		person2.setPersonName("Rose");
		session.save(person2);
		
		Address address=new Address();
		address.setAddressName("CHINA");
		//维护关联关系
		address.getPersons().add(person1);
		address.getPersons().add(person2);
		session.save(address);

		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	
	/**
	 * 删除数据:N端控制关联关系的删除
	 */
	private void deleteDateWithRelation_N(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Person person1=(Person)session.get(Person.class, new Long(1));
		Person person2=(Person)session.get(Person.class, new Long(2));
		session.delete(person1);
		session.delete(person2);
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	/**
	 * 删除数据:1端控制关联关系的删除
	 */
	private void deleteDateWithRelation_1(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		session.delete(address);
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}

	/**
	 * 添加关联关系:N端维护关联关系
	 */
	private void addRelationWithPerson(){
		
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		Person person1=(Person)session.get(Person.class, new Long(1));
		Person person2=(Person)session.get(Person.class, new Long(2));
		//维护关联关系
		person1.setAddress(address);
		person2.setAddress(address);
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	/**
	 * 添加关联关系:1端维护关联关系
	 */
	private void addRelationWithAddress(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		Person person1=(Person)session.get(Person.class, new Long(1));
		Person person2=(Person)session.get(Person.class, new Long(2));
		//维护关联关系
		address.getPersons().add(person1);
		address.getPersons().add(person2);
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	/**
	 * 删除关联关系:N端维护关联关系
	 */
	private void removeRelationWithPerson(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Person person1=(Person)session.get(Person.class, new Long(1));
		Person person2=(Person)session.get(Person.class, new Long(2));
		//维护关联关系
		person1.setAddress(null);
		person2.setAddress(null);
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	/**
	 * 删除关联关系:1端维护关联关系
	 * (必须设置inverse="true"，否则删除数据的时候将违反外键约束导致删除失败)
	 */
	private void removeRelationWithAddress(){
		Session session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Address address=(Address)session.get(Address.class, new Long(1));
		//维护关联关系
		address.getPersons().clear();
		session.flush();
		
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println("=============================================");
	}
	

}
