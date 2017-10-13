package com.ddb.javacore.oop;

public class TestSchool {

	public static void main(String[] args) {
		// 创建一个School实例对象
		//声明了一个School类型的center变量，让center指向创建出来的对象！
		School center = new School();
		System.out.println("center 初始化以前:");
		center.showCenter();
		/*
		 * .列出来的内容，含有括号的是方法，不含是属性
		 * 冒号后面的是属性的数据类型或者是方法的返回值类型。
		 * 提示最后面的类，表示这个属性或者方法的归属
		 */
		// 学校的名称是：null,教室的数量是：0,机房的数量是：0。
		// 属性是基本数据类型的会有默认初始值，引用类型为空值null
		
		// 进行属性初始化
		center.schoolName ="北京中心";
		center.classNum = 10;
		center.labNum = 10;
		System.out.println("center 初始化以后:");
		center.showCenter();
		

	}

}
