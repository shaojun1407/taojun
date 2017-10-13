package com.ddb.javacore.flow;

import java.util.Scanner;

public class BranchDemo {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请输入Java课程分数:");
		int score = input.nextInt();
		// 如果...就...的单路分支
		if (score > 90) {
			// 只有括号里的表达式值为true，才会执行大括号里的语句！
			System.out.println("考的不错，老师奖励一个MP4！");
		}

		// 如果...否则...的双路分支
		if (score >= 60) {
			System.out.println("不错，考试及格了。");
		} else {
			System.out.println("小样不及格，等着补考吧！！");
		}

		// 三目运算符 ? :
		String result = score > 60 ? "及格" : "不及格";
		System.out.println("result :" + result);

		// 如果...否则...连接的多路分支;
		if (score >= 90) {
			System.out.println("很好，成绩优秀！");
		} else if (score >= 80) {
			System.out.println("很好，成绩良好！");
		} else if (score >= 70) {
			System.out.println("很好，成绩中等！");
		} else if (score >= 60) {
			System.out.println("还行，及格了！");
		} else {
			System.out.println("不及格，等着补考吧！");
		}

		// switch...case...的多路分支
		System.out.println("下面演示switch...case:");
		switch (score) {
		case 90:
			System.out.println("你的成绩是90分，非常好！");
			break;
		case 80:
			System.out.println("你的成绩是80分，很好！");
			break;
		case 70:
			System.out.println("你的成绩是70分，还不错！");
			break;
		case 60:
			System.out.println("你的成绩是60分，及格了！");
			break;
		default:
			System.out.println("杯具了，不及格！");
			break;
		}
		// 总结：多路分支是范围表示，switch...case并不是很适合；
		// switch...case 适合的是常量，固定的东西。
		// 多路if其实比switch要强大
		// 通常情况下，break不可以省略
		// 默认分支在开始和在结束作用一样。

		// 分支嵌套
		System.out.println("------------------------------");
		if (score >= 60) {
			if (score > 70) {
				if (score > 80) {
					System.out.println("您的分数是80分以上");
				} else {
					System.out.println("您的分数是在70和80之间！");
				}
				
			} else {
				System.out.println("您的分数是在60和70之间！");
			}
		} else {
			System.out.println("分支嵌套：考试不及格！！");
		}

		System.out.println("执行结束！");

	}

}
