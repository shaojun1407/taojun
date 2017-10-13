package com.ddb.javacore.java8new;

import com.ddb.javacore.java8new.Lambda.GreetingService2;

//http://www.runoob.com/java/java8-lambda-expressions.html
public class Lambda {
	public static void main(String args[]) {
		Lambda tester = new Lambda();

		// 类型声明
		MathOperation addition = (int a, int b) -> a + b;

		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;

		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// 不用括号
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		// 无参数,括号不能省略，省略则报错！
		GreetingService2 greetService3 = () -> System.out.println("Hello World--有括号");
		// GreetingService2 greetService4 = -> System.out.println("Hello World --无括号！");
		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");
		greetService3.sayMessage();
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	// 没有参数的时候
	interface GreetingService2 {
		void sayMessage();
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}