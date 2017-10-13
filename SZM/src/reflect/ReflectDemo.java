package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;



import peixun.Student;

public class ReflectDemo {
@SuppressWarnings("all")//压制所有的警告
	public static void main(String[] args) throws ClassNotFoundException {
		// 要想使用反射，要现有clazz对象
		// 第一种方式:类名.class
		Class clazz = Student.class;
		// 第二种方式:对象。getClass();
		// Class class1=new Student().getClass();
		Student student = new Student();
		Class clazz2 = student.getClass();
		// 第三种方式:Class.forName();
		// java.lang.Class.forName
		System.out.println("clazz.getModifiers():" + clazz.getModifiers());
		System.out.println("Student类的权限修饰符:" + Modifier.toString(clazz.getModifiers()));
		// class java.lang.object
		System.out.println("clazz.getSuperclass():" + clazz.getSuperclass());
		// Student
		System.out.println("clazz.getSimpleName():" + clazz.getSimpleName());
		//null
		System.out.println("clazz.getComponentType():"+clazz.getComponentType());
		//[Ljava.lang.Class;@15db9742
		System.out.println("clazz.getInterfaces():"+clazz.getInterfaces());
		//
		System.out.println("clazz.getCanonicalName():"+clazz.getCanonicalName());
		//返回反射类所有的构造器
		Constructor[] constructors=clazz.getConstructors();
		System.out.println("Studentle类，有"+clazz.getDeclaredMethods().length+"个声明的方法!");
		Method[] methods =clazz.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method);
		}
		//打印所有的方法，包括继承来的方法
		System.out.println("Student类。有"+clazz.getMethods().length+"个方法!");
		Method[] methods2 =clazz.getMethods();
		for(Method method :methods2) {
			System.out.println(method);
		}
		System.out.println("Student类。有"+clazz.getDeclaredMethods().length+"个声明的成员属性!");
		java.lang.reflect.Field[] fields=clazz.getDeclaredFields();
		for(java.lang.reflect.Field field:fields) {
			System.out.println(field);
		}
		

	}

}
