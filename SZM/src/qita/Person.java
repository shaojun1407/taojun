package qita;

public class Person {
	private String name;
	private int age;

	public Person(int age) {
		name = "kehr";
		this.age = age;
	}

	// 含有一个字符串型的参数和一个整形参数的构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void talk() {
		System.out.println("我叫:" + name + "我今年:" + age + "岁");
	}

	public void setAge(String string) {
		// TODO Auto-generated method stub
		
	}

	public void say() {
		// TODO Auto-generated method stub
		
	}

	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}
}