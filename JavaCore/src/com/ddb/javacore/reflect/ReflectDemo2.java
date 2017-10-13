package com.ddb.javacore.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {

	@SuppressWarnings("all") // 压制所有的警告
	public static void main(String[] args) throws Exception {
		// Class 类的实例表示正在运行的 Java 应用程序中的类和接口。枚举是一种类，注释是一种接口。
		// 要想使用反射，要先有clazz对象！！！
		// 第一种方式：类名.class；
		Class<Student> clazz = Student.class; // 同时指定泛型的类型

		// 返回反射类所有的构造器
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("Student类，有" + constructors.length + "个构造函数！");
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		// 返回反射类指定的构造函数
		System.out.println("2个参数的指定构造器：");
		Constructor constructor = clazz.getConstructor(java.lang.String.class, int.class);
		System.out.println(constructor);

		// 使用反射来创建被反射类的实例对象
		// 方式一：使用clazz对向的newInstance()方法
		System.out.println("方式一：使用clazz对向的newInstance()方法");
		Student student = clazz.newInstance();
		System.out.println(student.toString());
		// 方式二：使用指定的构造器
		System.out.println("方式二：使用指定的构造器");
		// Student student2 = (Student) constructor.newInstance("lisi", 25);
		Student student2 = (Student) constructors[0].newInstance("lisi", 25);
		System.out.println(student2);

		// 获取声明的方法
		// 方式一：获取声明的所有方法
		System.out.println("Student类，有" + clazz.getDeclaredMethods().length + "个声明的方法！");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		// 获取声明的指定的方法
		System.out.println("获取指定的方法printSelf：");
		Method method2 = clazz.getDeclaredMethod("printSelf", int.class);
		System.out.println(method2);
		Method method = clazz.getDeclaredMethod("printSelf");
		System.out.println(method);

		// 用反射来调用方法---invoke()
		System.out.println("利用反射来调用指定的方法：");
		method2.invoke(student, 9999);

		method.setAccessible(true); // 设置强制访问为true，就可以访问private的方法
		method.invoke(student);

		// 获取声明的所有字段
		System.out.println("Student类，有" + clazz.getDeclaredFields().length + "个声明的成员属性！");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		// 获取指定的字段
		System.out.println("获取指定的字段：");
		Field field = clazz.getDeclaredField("name");
		System.out.println(field);

		// 获取sex字段
		Field sex = clazz.getDeclaredField("sex");

		// 访问字段
		System.out.println("用反射访问字段：");
		System.out.println("sex = " + sex.get(student));

		field.setAccessible(true); // 打破封装，强制访问
//		System.out.println("name = " + field.get(student)); // 这是读取属性值！

		// 设置字段：
		System.out.println("用反射设定属性值：");
		field.set(student, "lisi");
		System.out.println("name = " + field.get(student)); // 这是读取属性值！

	}

}
