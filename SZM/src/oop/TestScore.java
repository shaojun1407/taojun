package oop;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("请输入java成绩: ");
		int java =input.nextInt();
		int db = 0;
		int c = 0;
		int total=java +c+db;
		double avg=total/3;
		System.out.println("总成绩: "+total);
		System.out.println("\n平均分:"+avg);
		
		

	}

}
