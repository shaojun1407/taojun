package com.ddb.javacore.io;

import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
		File file2 = new File("D:\\abc.txt"); // 不存在
		File file3 = new File("D:\\GitHub\\Java6"); // 存在

		// 判断文件是否存在
		System.out.println("file.exists():" + file.exists());
		System.out.println("file2.exists():" + file2.exists());

		// 判断是否为目录
		System.out.println("file.isDirectory():" + file.isDirectory());
		System.out.println("file3.isDirectory():" + file3.isDirectory());

		// 列出目录下的内容：
		System.out.println("列出目录下的内容:");
		for (String string : file3.list()) {
			System.out.println(string);
		}

		// 文件的长度
		System.out.println("file.length():" + file.length());
		// 最后修改时间
		System.out.println("file.lastModified():" + file.lastModified());
		System.out.println("file.lastModified():" + new Date(file.lastModified()));

		//文件的绝对路径
		System.out.println("file.getAbsolutePath():" + file.getAbsolutePath());
	}

}
