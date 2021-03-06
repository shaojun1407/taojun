package com.ddb.hibernate.relation.one_one.foreignsingle;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Address {

	private long addressId;

	private String addressName;

	public String toString() {
		return addressId + ":" + addressName;
	}

}
