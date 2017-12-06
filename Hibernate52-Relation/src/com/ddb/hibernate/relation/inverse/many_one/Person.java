package com.ddb.hibernate.relation.inverse.many_one;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Person {
	private long personId;
	
	private String personName;
	
	private Address address;
	
	public String toString() {
		return personId+":"+personName;
	}	
}
