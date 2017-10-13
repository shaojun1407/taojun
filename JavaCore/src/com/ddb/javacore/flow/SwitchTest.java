package com.ddb.javacore.flow;

public class SwitchTest {

	public static void main(String[] args) {
		 System.out.println(getInfo(90));
		System.out.println(getInfo(70));
		System.out.println(getInfo(60));

	}

	public static String getInfo(int score) {
		switch (score) {
		case 90:
			System.out.println("in 90");
			return "score is " + score;
		case 80:
			System.out.println("in 80");
			return "score is " + score;
		case 70:
			System.out.println("in 70");
			return "score is " + score;

		default:
			System.out.println("in default... ");
			break;
		}
		return "...";
	}

}
