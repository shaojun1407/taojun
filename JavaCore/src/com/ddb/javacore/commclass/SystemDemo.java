package com.ddb.javacore.commclass;

import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) {

		// 打印：返回以毫秒为单位的当前时间
		System.out.println("当前的时间：" + System.currentTimeMillis());

		// 返回当前所有系统属性的Properties集合
		Properties properties = System.getProperties();
		System.out.println(properties);
		// 返回相应的key对应的系统属性
		String osName = System.getProperty("os.name");
		System.out.println("OS Name:" + osName);

		// 返回一个不能修改的当前系统环境的字符串映射视图。
		System.out.println(System.getenv());

		// 运行垃圾回收器，让虚拟机尽最大努力从所有丢弃的对象中收回空间
		System.gc();

		// 终止正在运行的JVM，0表示正常退出，非0表示异常终止
		System.exit(1);

	}

}
