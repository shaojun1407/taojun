package com.ddb.javacore.io;

import java.util.Scanner;

public class SystemStdDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		do {
			System.out.println("请输入：");
			input = scanner.nextLine();
			if (!"quit".equals(input)) {
				System.err.println(input);
			}
		} while (!"quit".equals(input));

		scanner.close();
	}

}
