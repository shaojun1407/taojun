package com.ddb.javacore.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {

	public static void main(String[] args) {

		try {
			File file = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				String info = in.nextLine();
				System.out.println(info);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
