package com.ddb.javacore.oop3;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Penguin extends Pet {
	//alt+shift +a ,可以多行同步修改，例如增加private关键字
	private String sex;	

	public Penguin() {
		super();
		System.out.println("Penguin 类初始化...");
	}

	@Override
	public void print() {
		
	}

	//宠物喂食的方法
	public void eat() {
		System.out.println("这是QQ的喂食方法！");
	}
	
	//和主人一起游泳
	public void swimming () {
      	System.out.println("QQ和主人一起游泳！");
	}

}
