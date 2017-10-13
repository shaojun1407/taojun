package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		File file = new File("D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
		try {
			FileReader fr = new FileReader(file);	//数据来源于文件
			// InputStreamReader isr = new InputStreamReader(System.in);	//数据来源控制台
			// BufferedReader br = new BufferedReader(isr);
			BufferedReader br = new BufferedReader(fr);
			String s;
			// System.out.println("请输入内容：");
			s = br.readLine();
			//while (！"".equals(s)) {
			while (null != s) {
				System.out.println("Read :" + s);
				s = br.readLine();
			}

			br.close();
			// isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
