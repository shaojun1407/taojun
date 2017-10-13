package peixun;

import java.util.Scanner;

import lombok.Getter;
@Getter
public class InitialVistor {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// Visitor v = new Visitor();
		// System.out.print("请输入姓名：");
		// v.name = input.next();
		// System.out.print("请输入年龄：");
		// v.age = input.nextInt();
		// v.show();
		// }

		System.out.println("");
		Visitor v = new Visitor();
		Scanner input = new Scanner("请输入姓名；");
		v.name = input.next();
		System.out.println("请输入年龄:");
		v.age = input.nextInt();
		v.show();

	}
}