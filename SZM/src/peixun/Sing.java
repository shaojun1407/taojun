package peixun;

public class Sing {
	// 用来储存当前类的一个实例、对象
	private static Sing instance = null;// 懒汉式
	// private static Sing instance =new Sing();饿汉式

	// 私有化构造方法

	private Sing() {
		System.out.println("构造函数被执行:");
	}

	// 提供外部可以得到的对象实例方法
	public static Sing getInstance() {
		if (instance == null) {
			instance = new Sing();
		}
		return instance;
	}

}
