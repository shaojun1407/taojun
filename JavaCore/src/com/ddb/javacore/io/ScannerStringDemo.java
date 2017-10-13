package com.ddb.javacore.io;

import java.util.Scanner;

public class ScannerStringDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner("AAA:BBB:CCC");
		in.useDelimiter(":");

		String info = null;
		while (in.hasNext()) {
			info = in.next();
			System.out.println(info);
		}
		in.close();

	}

}
