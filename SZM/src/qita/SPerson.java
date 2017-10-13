package qita;

import javax.print.attribute.standard.RequestingUserName;

public class SPerson {
	private String name;
	private int age;

	private void talk() {
		System.out.println("我是:" + name + "今年:" + age + "岁");
	}

	public void say() {
		talk();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
