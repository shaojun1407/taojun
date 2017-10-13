package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrayReaderDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("CharArrayReaderDemo...");
		char[] charArray = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'd', '！' };
		CharArrayReader car = new CharArrayReader(charArray);
		BufferedReader br = new BufferedReader(car);

		CharArrayWriter caw = new CharArrayWriter();
		BufferedWriter bw = new BufferedWriter(caw);

		char[] buf = new char[charArray.length];
		br.read(buf, 0, charArray.length);
		System.out.println(String.valueOf(buf));
		System.out.println("写入buf");
		bw.write(buf);
		bw.flush();	//刷新缓冲区
		// bw.close();// 不能缺少！
		System.out.println(caw.toString());

	}

}
