package com.ddb.hibernate.relation.inverse.many_many;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Person {
	private long personId;

	private String personName;

	private Set<Address> addresses = new HashSet<Address>();

	public String toString() {
		return personId + ":" + personName;
	}
}
