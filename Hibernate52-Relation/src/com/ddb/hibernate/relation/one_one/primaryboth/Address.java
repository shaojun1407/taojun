package com.ddb.hibernate.relation.one_one.primaryboth;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Address {

	private long addressId;

	private String addressName;
	
	private Person person;

	public String toString() {
		return addressId + ":" + addressName;
	}

}
