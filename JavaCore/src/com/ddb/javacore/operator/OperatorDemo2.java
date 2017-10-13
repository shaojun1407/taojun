package com.ddb.javacore.operator;

public class OperatorDemo2 {

	public static void main(String[] args) {
		// 三目运算符 ？ :
		int num = 9, num2 = 5;
		int num3 = num < num2 ? num : num2;
		// 如果？前面的表达式值为真true的时候，取值是冒号前面的值，否则取冒号后面的值
		System.out.println("num = " + num);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		// boolean ret = num > num2? true:false;

		// 字符串操作符 +
		String str1 = "anhui";
		String str2 = ",hefei";
		int code = 35;
		String result = str1 + str2 + code + " 号";
		System.out.println("result :" + result);
		// 要注意是：+作为字符串的连接运算符，当有大量的字符串进行拼接时，它的效率很低。

		// 类型转换操作符 ()
		int i = 15;
		byte j = (byte) i; // 如果行号前面出现X号，单击会出现修正提示
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		byte k = 10;
		System.out.println("k = " + k);
		i = k;// 数字类型转换，大转小需要强制转换，小转大自动 转换
		System.out.println("i = " + i);

		// 自增自减运算符 ++ --
		int age1 = 5;
		int count;
		System.out.println("age1 = " + age1);
		count = 2 * age1++; // 先使用后增加
		System.out.println("count = " + count);
		System.out.println("age1 = " + age1);
		// age1--; // 先使用后减小
		count = 2 * age1--; // 先使用后减少
		System.out.println("count = " + count);
		System.out.println("age1 = " + age1);

		int age2 = 10;
		int c2;
		// c2 = 2 * --age2; //先自减再参与运算
		c2 = --age2 * 2; // 建议成这样
		System.out.println("c2 = " + c2);
		System.out.println("age2 = " + age2);
		c2 = 2 * ++age2; // 先自增再参与运算
		System.out.println("c2 = " + c2);
		System.out.println("age2 = " + age2);

		// 扩展赋值运算
		int a = 8;
		// a /= 4; 等效于 a = a / 4
		System.out.println("a = " + a);
		System.out.println("a /= 4 :" + (a /= 4));
		a += 5;	// a = a+5;
		a *= 3;	// a = a*3;
		a %= 3;	// a = a % 3;

	}

}
