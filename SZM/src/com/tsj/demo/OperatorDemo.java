package com.tsj.demo;

public class OperatorDemo {

	public static void main(String[] args) {
		int a= 30;
		int b= 5;
		System.out.println("a+b ="+(a+b));//通过（）来改变运算顺序
		//逻辑运算
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 && b2 :"+(b1 && b2));
		System.out.println("b1 || b2 :"+(b1 || b2));
		System.out.println("!b1 :" +(!b1));//取反，取非
		boolean b3 =true;
		System.out.println("b1 && b3 :"+(b1&&b3));
		
		int c=5;
		++c; System.out.println("c="+c);
	

	}
}
