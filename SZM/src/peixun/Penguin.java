package peixun;

public class Penguin {
	// 如果不显示定义构造函数，则系统默认存在无参的构造函数
	// 如果显试定义了，则默认的就不存在了

	String name;
	String sex;
	int love;

	public Penguin() {
		name = "qq";
		sex = "q仔";
		love = 20;
		// 等效于给成员属性赋值

	}

	// 定义有参数的构造函数

	@Override
	public String toString() {
		return "[ Penguin name=" + name + ", sex=" + sex + ",love=" + love + "]";
	}

}
