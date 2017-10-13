package com.ddb.javacore.annotation;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Human {
	private String name;
	@Deprecated
	private Integer age;

	@Deprecated
	public String say() {
		return "Human say()...";
	}

}
