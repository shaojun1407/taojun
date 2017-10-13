package com.ddb.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	private static Scanner in;

	// 使用throws声明抛出多个异常，多个异常类之间使用逗号分隔
	// public static void main(String args[]) throws
	// ArithmeticException,InputMismatchException,Exception { //方式二 继续声明异常的抛出，让JVM处理
	public static void main(String args[]) { // 方式二 继续声明异常的抛出，让JVM处理
		System.out.println("欢迎使用新安牌计算器！");

		// int result = divMethod();
		int result = -1;
		// 方式一： main方法自己捕捉异常处理
		try {
			result = divMethod2();
		} catch (ByZeroException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		System.out.println("方法执行的返回值为：" + result);

		switch (result) {
		case 0:
			System.out.println("0---正常结束！");
			break;
		case 1:
			System.out.println("1---发生了 算术异常");
			break;
		case 2:
			System.out.println("2---发生了 输入不匹配异常");
			break;
		case 3:
			System.out.println("3---发生了其他异常");
			break;
		default:
			System.out.println("4---执行到finally语句块");
			break;
		}

		System.out.println("感谢使用本程序！");

	}

	@SuppressWarnings("finally")
	private static int divMethod() {
		in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		try {
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			// 这里放置可能出现异常的代码
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
			return 0; // 0表示正常结束！
		} catch (ArithmeticException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了算术异常");
			System.out.println(e.getMessage()); // getMessage显示的信息比较简短
			// e.printStackTrace();
			// System.exit(1); //退出JVM虚拟机，所以后面的代码就没有机会执行！
			return 1; // 1 表示发生了 算术异常
		} catch (InputMismatchException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了输入不匹配异常");
			e.printStackTrace(); // 显得异常信息就非常详细，对于调试程序非常有帮助！
			return 2; // 2 表示发生了 输入不匹配异常
		} catch (Exception e) {
			// 异常出现，对应的处理方案
			// 其他所有的异常情况，都是用下面的解决方案
			System.out.println("程序执行出现了异常！");
			e.printStackTrace();
			// 异常的顺序，要注意：子异常在前面，父异常在后面，一定不能反！
			return 3; // 3 发生了其他异常
		} finally {
			System.out.println("我在finally 语句块里面，你见到我就说明，我已经被执行了！");
			// return 4; // 4 表示执行到finally语句块
		}

		// return 5; 死码！
	}

	private static int divMethod2() throws Exception {
		in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = in.nextInt();
		System.out.print("请输入除数:");
		int num2 = in.nextInt();

		// 检查num2的值
		if (0 == num2) {
			System.out.println("乱输入参数，乱棍打碎！");
			// 自己主动抛出一个异常，throw后面跟的是异常对象！
			// throw new Exception("输入的除数为0，值非法！");
			// 使用自定义异常类
			throw new ByZeroException("输入的除数为0，值非法！----这是自定义的异常信息！");
		}

		// 这里放置可能出现异常的代码
		System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));

		return 0; // 0表示正常结束！

	}

}
