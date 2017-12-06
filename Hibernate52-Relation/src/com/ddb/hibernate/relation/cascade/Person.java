package com.ddb.hibernate.relation.cascade;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Person {
	private long personId;
	
	private String personName;
	
	private Address address;
	
	public String toString() {
		return personId+":"+personName;
	}
}
