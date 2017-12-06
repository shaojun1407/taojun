package com.ddb.hibernate.inherit.joinsubclass;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Employee extends Person {
	private String job;

	public Employee() {
		super();
	}

	public Employee(long personId,String personName,String job) {
		super(personId,personName);
		this.job = job;
	}

	public String toString() {
		return  "Employee#["+getPersonName()+":"+getPersonId()+":"+getJob()+"]";
	}
}
