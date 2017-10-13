package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharDemo {

	public static void main(String[] args) {
		// 创建需要File对象
		File input = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
		File output = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemoBk.java");

		try {
			// 创建需要的Reader和Writer
			FileReader fr = new FileReader(input);
			FileWriter fw = new FileWriter(output);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String tmp = br.readLine();
			// 循环读取和写入
			while (tmp != null) {
				bw.write(tmp);
				bw.newLine();	//利用换行来还原格式
				tmp = br.readLine();
			}
			// 关闭流，关闭顺序不能反
			br.close();
			bw.close();
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
