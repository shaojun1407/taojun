package com.shao.struts2.struts2ognl;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Address {
	private String country;
	private String city;
	private String street;
	
	public Address() {
		super();
	}
	
	public Address(String country,String city,String street) {
		super();
		this.country=country;
		this.city=city;
		this.street=street;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", street=" + street + "]";
	}

}
