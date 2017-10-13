package shangke;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明数组
		int[] score;
		// 分配空间
		score = new int[5];
		// 初始化数组
		score[0] = 10;
		System.out.println("数组中第一个元素：" + score[0]);
		System.out.println("修改数组中第一个元素值...");
		score[0] = score[0] * 8;
		System.out.println("数组中第一个元素:"+score[0]);
		int[] ages = new int[5];
		// 所有数组类型必须一致
		int[] prices = { 20, 30, 40 };
		int[] ids = new int[] { 11, 22, 33 };// 要注意等号后面括号不能写数字
		// 数组越界异常
		System.out.println(prices[3]);

	}

}
