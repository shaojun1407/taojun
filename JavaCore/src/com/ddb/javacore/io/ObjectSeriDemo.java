package com.ddb.javacore.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSeriDemo {

	public static void main(String[] args) {

		try {
			System.out.println("对象序列化开始...");
			String url = "D:\\GitHub\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\person.object";
			FileOutputStream fos = new FileOutputStream(url);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new Person("Id001", "zhangsan", "123456"));
			oos.writeObject(new Person("Id002", "zhangsan", "123666"));
			oos.close();
			System.out.println("对象序列化结束！");

			System.out.println("------------------------------------------");
			System.out.println("对象反序列化开始...");
			FileInputStream fis = new FileInputStream(url);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person person = (Person) ois.readObject();
			System.out.println(person.getName());
			System.out.println(ois.readObject());
			
			System.out.println();
			ois.close();
			System.out.println("反序列化结束！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
