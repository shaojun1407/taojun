package shangke;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 分配一个数组，并分配空间值为5
		int[] score = { 60, 85, 70, 90, 80 };
		System.out.println("数组原始序列：");
		outputArray(score);
		Arrays.sort(score, 1, 4);
		System.out.println("数组排序后：");
		outputArray(score);

	}

	private static void outputArray(int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "\t");
		}
		System.out.println();
	}

}
