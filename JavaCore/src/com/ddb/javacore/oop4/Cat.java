package com.ddb.javacore.oop4;

import com.ddb.javacore.oop3.Pet;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Cat extends Pet {
	private String strain;	
	
	
	public Cat() {
		super();
		System.out.println("Cat 类初始化...");
	}
	
	public void print() {
		
	}

	@Override	//使用这个注解告诉系统，我要重写父类的方法，如果方法名写错了会被检查到
	public String toString() {
		System.out.println(super.toString());
		return "Cat [strain=" + strain + "]" ;
	}

	//宠物喂食的方法
	public void eat() {
		System.out.println("这是Cat的喂食方法！");
	}
	
	public void catchMouse() {
		System.out.println("Cat 抓老鼠！");
	}

}
