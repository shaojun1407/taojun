package com.ddb.hibernate.inherit.subclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends Person {
	private String comment;

	public Customer() {
		super();
	}

	public Customer(long personId, String personName, String comment) {
		super(personId, personName);
		this.comment = comment;
	}

	public String toString() {
		return "Customer#[" + getPersonName() + ":" + getPersonId() + ":" + getComment() + "]";
	}
}
