package com.ddb.javacore.oop3;

import java.awt.print.Printable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter 
public abstract class Pet {

	private String name;
	private int health;
	private int love;

	public Pet() {
		System.out.println("Pet 类初始化...");
	}

	@Override	//重写Object的toString方法
	public String toString() {
		return "[name=" + name + ", health=" + health + ", love=" + love + "]";
	}

	public abstract void print();

	public abstract void eat();
	
}