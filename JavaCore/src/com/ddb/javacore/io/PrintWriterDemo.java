package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		try {
			System.out.println("备份文件开始...");
			FileReader fReader = new FileReader(
					"D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemo.java");
			FileWriter fWriter = new FileWriter(
					"D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\FileDemoBK.java");

			BufferedReader br = new BufferedReader(fReader);
			PrintWriter pWriter = new PrintWriter(fWriter);

			String s;
			s = br.readLine();
			while (null != s) {
				//pWriter.write(s);	//打印不换行
				pWriter.println(s);
				s = br.readLine();
			}
			pWriter.close();
			br.close();
			fReader.close();
			fWriter.close();
			System.out.println("备份文件结束！");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
