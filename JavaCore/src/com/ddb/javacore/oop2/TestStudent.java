package com.ddb.javacore.oop2;

public class TestStudent {

	// 显示信息,使用传参的方法
	public void showStudent(int id, String name, int age, int score, char sex) {
		System.out.println(id + "\t" + name + "\t" + age + "\t" + score + "\n" + sex);
	}

	// 使用对象的方式
	public void showStudent(Student st) {
		System.out.println(st.id + "\t" + st.name + "\t" + st.age + "\t" + st.score + "\n" + st.sex);

	}
	/*
	 * 总结：方法使用使用多参数传值，缺点：1.当改变方法定义的参数列表时，调用的地方必须同步修改；
	 * 2.参数很多时，在调用的时候，很难记住参数列表的详细信息。
	 * 对于使用对象作为方法参数传递，就没有这些问题！
	 * 
	 */
	
	
	public static void main(String[] args) {
		TestStudent tStudent = new TestStudent();
		// 使用多参数的方式
		tStudent.showStudent(2, "zhangsan", 34, 75, 'F');

		// 使用对象作为参数的方式
		Student st = new Student();
		st.age = 20;
		st.id = 3;
		st.name = "lisi";
		st.score = 80;
		st.sex = 'E';
		tStudent.showStudent(st);

	}

}
