package com.ddb.javacore.datatype;

public class Birthday {
	private int day;
	private int month;
	private int year;

	/*
	 * 这是基本数据类型的参数传值
	 */
	public void displayer(int year, int month, int day) {
		day = 11;
		month = 11;
		year = 2015;
		System.out.println("传递方法中：" + year + "-" + month + "-" + day);
	}

	public void displayer(Birthday birthday) {
		birthday.day = 12;
		birthday.month = 12;
		birthday.year = 2012;

		System.out.println("引用传递方法中：" + birthday.year + "-" + birthday.month + "-" + birthday.day);

	}

	/*
	 * 基本数据类型值传递测试,static修饰的方法，可以不用对象来调用
	 */
	public static void testValue1() {
		Birthday birthday = new Birthday();
		int year = 2017;
		int month = 12;
		int day = 12;
		System.out.println("传递之前：" + year + "-" + month + "-" + day);
		// 按下ctrl，将鼠标移动到方法名上，会变成一个超链接，单击可以跳到方法内部！
		birthday.displayer(year, month, day);
		System.out.println("传递之后：" + year + "-" + month + "-" + day);

	}

	/*
	 * 引用数据类型，传递测试
	 */
	public static void testValue2() {
		Birthday birthday = new Birthday();
		birthday.year = 2017;
		birthday.month = 3;
		birthday.day = 3;
		System.out.println("引用传递之前：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
		birthday.displayer(birthday);
		System.out.println("引用传递之后：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	}

	public static void main(String[] args) {
		testValue1();
		testValue2();

		// 结论：基本数据类型作为方法实参传递，在方法内重新赋值，离开方法后失效;
		// 如果是引用类型传递，在方法内修改了对象的属性值，则真修改！

	}

}
