package com.ddb.javacore.oop3;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Dog extends Pet {
	private String strain;	
	
	
	public Dog() {
		super();
		System.out.println("Dog 类初始化...");
	}
	
	public void print() {
		
	}

	@Override	//使用这个注解告诉系统，我要重写父类的方法，如果方法名写错了会被检查到
	public String toString() {
		System.out.println(super.toString());
		return "Dog [strain=" + strain + "]" ;
	}


	public Pet getDog() {
		return this;
	}

	//宠物喂食的方法
	public void eat() {
		System.out.println("这是Gougou的喂食方法！");
	}
	//定以和主人的玩耍方法
	public void catchingFlyDisc() {
      	 System.out.println("Gougou和主人正在玩飞碟！");
	}

	
}
