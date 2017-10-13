package com.ddb.javacore.io;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Serializable {
	//在对象序列化过程中，其所属类的static属性和方法代码不会被序列化处理

	private static final long serialVersionUID = 1L;

	private String personId;
	private String name;
	private transient String pass;	//这个密码字段是敏感字段，不希望它被序列化，可以是使用transient关键字修饰

	// 构造函数
	public Person() {
		super();
	}

	public Person(String personId, String name, String pass) {
		super();
		this.personId = personId;
		this.name = name;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", pass=" + pass + "]";
	}

}
