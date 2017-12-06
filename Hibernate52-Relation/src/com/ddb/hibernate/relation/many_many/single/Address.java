package com.ddb.hibernate.relation.many_many.single;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Address {
	
	private long addressId;
	
	private String addressName;
	
	private Set<Person> persons=new HashSet<Person>();

	public String toString() {
		return addressId+":"+addressName;
	}
}
