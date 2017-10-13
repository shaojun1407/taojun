package com.ddb.javacore.datatype;

public class Person {
	
	//这叫语句块
	{
		int score =60;	//也是局部变量，是在语句块里
		System.out.println("这是语句块中的打印！分数是："+score);
	}

	// 成员变量
	private String name = "Jack";
	private int age = 35;
	private boolean married = true;

	// 构造函数
	public Person() {
		// 这是一个无参的构造函数，系统默认就有
	}

	// 有参数的构造函数
	public Person(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}

	// 定义一个displayer方法,打印出这个对象的自身信息
	public void displayer() {
		System.out.println("姓名是：" + this.name + " 年龄是:" + this.age + " 婚姻状况:" + this.married);
	}
	
	public void printSelf(String name,int age,boolean married) {
		System.out.println("姓名是：" + name + " 年龄是:" + age + " 婚姻状况:" + married);
	}
	
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", married=" + married + "]";
	}

	public static void main(String[] args) {
		//这些是局部变量
		String name = "lisi";
		int age =32;
		
		//使用默认无参的构造函数
		Person p = new Person();
		p.displayer();
		
		//使用有参数的构造函数
		Person p2 = new Person("luna",23,false);
		p2.displayer();
		
		p2.printSelf("liming", 30, true);
		
		//调用p2的toString()方法，打印方法的返回值！
		System.out.println(p2.toString());
		
	}

}
