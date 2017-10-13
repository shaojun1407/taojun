package com.ddb.javacore.operator;

public class OperatorDemo {

	public static void main(String[] args) {
		// 算术运算
		int a = 32;
		int b = 5;
		// syso + alt +/ 可以快速完成System.out.println();的输入
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b =" + a + b);
		// 通过使用()来改变运算顺序
		System.out.println("a + b =" + (a + b));
		System.out.println("a - b =" + (a - b));
		System.out.println("a * b =" + (a * b));
		System.out.println("a / b =" + (a / b));
		System.out.println("a % b =" + (a % b)); // 取余数运算

		// 关系运算
		System.out.println("a > b :" + (a > b));
		System.out.println("a >= b :" + (a >= b));
		System.out.println("a == b :" + (a == b));
		System.out.println("a < b :" + (a < b));
		System.out.println("a <= b :" + (a <= b));
		System.out.println("a != b :" + (a != b));
		// System.out.println("a >< b :" + (a >< b)); //不支持

		// 逻辑运算
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("bl ==" + b1);
		System.out.println("b2 ==" + b2);
		System.out.println("b1 && b2 :" + (b1 && b2)); // 相与
		System.out.println("b1 || b2 :" + (b1 || b2)); // 相或
		System.out.println(" !b2 :" + (!b2)); // 取反，取非

		boolean b3 = true;
		System.out.println("b3 ==" + b3);
		System.out.println("b1 && b3 :" + (b1 && b3)); // 相与
		System.out.println("b1 || b3 :" + (b1 || b3)); // 相或

		// 短路运算：
		/*
		 * 总结：
		 * 逻辑与短路：如果第一个为false，后面的则不运算 
		 * 逻辑或短路：如果第一个为true，后面则不运算。
		 */
		int aa = 5;// 定义一个变量；
		boolean bb = (aa < 4) && (aa++ < 10);
		System.out.println("使用短路逻辑运算符的结果为" + bb);
		System.out.println("aa的结果为" + aa);
		
		System.out.println("逻辑或短路测试：");
		//boolean cc = (aa < 4) || (aa++ < 10);
		boolean cc = (aa > 4) || (aa++ < 10);
		System.out.println("cc的结果为" + cc);
		System.out.println("aa的结果为" + aa);
		

		// 三目运算符 ？ :

	}

}
