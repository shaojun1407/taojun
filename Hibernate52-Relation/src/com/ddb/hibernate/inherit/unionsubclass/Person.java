package com.ddb.hibernate.inherit.unionsubclass;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Person {
	private long personId;
	private String personName;
	
	public Person() {
		super();
	}

	public Person(long personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public String toString() {
		return "Person#["+getPersonId()+":"+getPersonName()+"]";
	}
}
