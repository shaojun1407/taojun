package com.ddb.hibernate.relation.many_many.both;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Person {
	private long personId;

	private String personName;

	private Set<Address> addresses = new HashSet<Address>();

	public String toString() {
		return personId + ":" + personName;
	}
}
