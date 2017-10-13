package com.ddb.javacore.io;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemStdDemo2 {

	public static void main(String[] args) throws Exception {
		System.out.println("演示开始...");	//这个时候没有改输出目的地，所以它会在控制台输出

		FileInputStream in = new FileInputStream(
				"D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
		System.setIn(in);

		PrintStream out = new PrintStream("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\aaa.txt");
		System.setOut(out);
		Scanner scanner = new Scanner(in);
		do {
			String info = scanner.nextLine();
			System.out.println(info);
			// info = scanner.nextLine();
		} while (scanner.hasNextLine());
		//这个时候，输出目的地已经被修改，所以不会在控制台在打印出来，而是打到文件中了！
		System.out.println("演示结束...");
	}

}
