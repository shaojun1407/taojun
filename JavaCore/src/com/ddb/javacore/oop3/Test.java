package com.ddb.javacore.oop3;

public class Test {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("awang");
		dog.setStrain("哈士奇");
		System.out.println(dog.toString());
		
		Penguin penguin = new Penguin();
		penguin.setName("QQ");
		System.out.println(penguin.toString());
	}

}
