package com.tsj.demo;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Score {
	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入Java课程分数:");
		 * int score = input.nextInt(); System.out.println("下面演示switch case:"); switch
		 * (score) { case 90: System.out.println("你的成绩是90分，非常好！:"); break; case 80:
		 * System.out.println("你的成绩是80分，很不错！:"); break; case 70:
		 * System.out.println("你的成绩是70分，良好！:"); break; case 60:
		 * System.out.println("你的成绩是60分，及格！:"); break; default:
		 * System.out.println("悲剧了，不及格！:"); break; }
		 * 
		 * if (score > 60) { if (score > 70) { if (score > 80) {
		 * System.out.print("您的分数是80分以上"); } else { System.out.println("您的分数是70和80之间！");
		 * } } else { System.out.println("您的分数是60和70之间！"); } } else {
		 * System.out.println("分支嵌套；考试不及格！"); } System.out.println("执行结束！");
		 */

		/*
		 * int i = 1;
		 while (i <= 100) {
			System.out.println("第" + i + "遍写 好好学习，天天向上 ");
			i++;
		}*/
		
		
		
		/*int i=1;
		do{
			System.out.println("第"+i+"遍写      好好学习，天天向上！");
			i++;
		} while (i<=100);
		*/
		
		/*int i;
		for (i=1;i<=100;i++) {
			System.out.println("第"+i+"遍写    好好学习，天天向上！");
		}
		*/
		/*int sum=0;
		 Scanner input =new Scanner(System.in);
		 for (int i=1;i<5;i++) {
			 System.out.println("请输入5门课的第"+i+"门课程成绩：");
			 sum +=input.nextInt();
		 }
			System.out.println("5门课程的总和："+sum);
			int avg =sum/5;
			System.out.println("5门课程的平均分："+avg);*/
		
		
		
		
		
		/*final int SUM=6;
		for (int i=0,j=SUM;i<=SUM;i++,j--) {
			System.out.println(i+"+"+j+"="+(i+j));
		}*/
		
		
		
		for (int i = 0; i <= 3; i++) {	
			System.out.print("*");
			for (int j = 0; j <= 7; j++) {
				
				System.out.print("*");
		}
		System.out.println();
		}
	}
}