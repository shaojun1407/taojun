package com.ddb.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ddb.javacore.array.Student;

public class ExceptionDemo {

	private static Scanner in;

	public static Student getStudent() {
		return null;
	}

	public static void main(String args[]) {
		in = new Scanner(System.in);
		System.out.print("请输入被除数:");

		try {
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			// 这里放置可能出现异常的代码
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
		} catch (ArithmeticException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了算术异常");
			System.out.println(e.getMessage()); // getMessage显示的信息比较简短
			// e.printStackTrace();
			System.exit(1);		//退出JVM虚拟机，所以后面的代码就没有机会执行！
		} catch (InputMismatchException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了输入不匹配异常");
			e.printStackTrace(); // 显得异常信息就非常详细，对于调试程序非常有帮助！
		} catch (Exception e) {
			// 异常出现，对应的处理方案
			// 其他所有的异常情况，都是用下面的解决方案
			System.out.println("程序执行出现了异常！");
			e.printStackTrace();
			// 异常的顺序，要注意：子异常在前面，父异常在后面，一定不能反！
		} finally {
			System.out.println("我在finally 语句块里面，你见到我就说明，我已经被执行了！");
		}
		
		
		//Student student = getStudent();
		//student.toString();		//调用一个null对象的的属性或者方法，则必然发生空指针异常
		
		System.out.println("感谢使用本程序！");

	}

}
