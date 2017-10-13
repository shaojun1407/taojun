package com.ddb.javacore.annotation;

import java.lang.reflect.Field;

public class AnnotationProccessor {

	public static void main(String[] args) throws Exception {
		// 获得被反射类的一个clazz实例
		Class<Student> clazz = Student.class;
		// 创建一个student的实例对象
		// Student student = clazz.newInstance();
		Student student = new Student();

		System.out.println("注解处理前：" + student);
		// 得到所有的字段
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			// 判断字段上面是否有指定的注解
			if (field.isAnnotationPresent(HelloWorld.class)) {
				HelloWorld helloWorld = field.getAnnotation(HelloWorld.class);
				// 打印一下注解的值
				System.out.println("HelloWorld 注解的值：" + helloWorld.value());
				// 打破封装
				field.setAccessible(true);
				// 判断属性值是否为空或空串
				String initValue = (String) field.get(student);
				if (null == initValue || "".equals(initValue)) {
					// 将注解的值设给属性
					field.set(student, helloWorld.value());
				}

			}
		}
		System.out.println("注解处理后：" + student);

	}

}
