package com.ddb.javacore.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStreamDemo {

	public static void main(String[] args) {
		// 创建需要File对象
		File input = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
		File output = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemoBk.java");

		try {
			// 创建需要的Reader和Writer
			FileReader fr = new FileReader(input);
			FileWriter fw = new FileWriter(output);	
			//FileWriter fw = new FileWriter(output,true); //追加不覆盖原来的内容
			int read = fr.read();

			// 循环读取和写入
			while (read != -1) {
				fw.write(read);
				read = fr.read();
			}
			// 关闭流
			fr.close();
			fw.close();
			System.out.println("Copy OK!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
