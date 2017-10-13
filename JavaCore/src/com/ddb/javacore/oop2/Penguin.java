package com.ddb.javacore.oop2;

public class Penguin {
	// 定义静态常量，是类层次的，不依赖于单个对象
	static final String SEX_MALE = "Q仔";
	static final String SEX_FEMALE = "Q妹";

	private String name = "QQ";
	private String sex = "Q仔";
	private int love = 20;
	private int age = 3;

	// 如果不显式定义构造函数，则系统默认存在无参的构造函数
	// 如果显式定义了，则默认的就不存在了

	// public Penguin() {
	// // name = "QQ";
	// // sex = "Q仔";
	// // love = 20;
	// // 等效于给成员属性赋值
	// }
	// 无参构造函数
	public Penguin() {
		super();
		System.out.println("我是无参构造函数！");
	}

	public Penguin(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
		System.out.println("我是2个参数的构造函数！");
	}

	// 三个参数的构造函数，定义有参数的构造函数
	public Penguin(String name, String sex, int love) {
		// this 表示的是当前对象
		this(name, sex);
		this.love = love;
		System.out.println("Penguin的有参构造函数已执行！");

		System.out.println("我是3个参数的构造函数！");
	}

	// 四个属性的构造函数
	public Penguin(String name, String sex, int love, int age) {
		this(name, sex, love);
		this.age = age;
		System.out.println("我是4个参数的构造函数！");
	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + ", sex=" + sex + ", love=" + love + ", age=" + age + "]";
	}

	// 使用static定义一个类层次的方法
	public static void print() {
		System.out.println("我是静态方法！");
	}

	// set 和 get 方法
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 100 && age < 0) {
			System.out.println("age 值非法！");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

}
