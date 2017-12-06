package com.ddb.hibernate.relation.many_one.singleonemany;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Person {
	private long personId;
	
	private String personName;
	
	public String toString() {
		return personId+":"+personName;
	}
	
}
