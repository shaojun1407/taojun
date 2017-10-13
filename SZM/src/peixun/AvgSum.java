package peixun;

import java.util.Scanner;

public class AvgSum {
	private Scanner input;
	public int sum() {
		int sum=0;
		System.out.println("请输入三门课程的第一门成绩： ");
		Scanner input =new Scanner(System.in);
		 sum = input.nextInt();
		System.out.println("请输入三门课的第二门成绩：");
		sum +=input.nextInt();
		System.out.println("请输入三门课的第三门成绩:");
		sum +=input.nextInt();
		System.out.println("请输入总成绩:");
		return sum;
		
	}
        public float avg() {
	return (float) sum()/3;
	
}
}
