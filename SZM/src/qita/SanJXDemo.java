package qita;

public class SanJXDemo {

	public static void main(String[] args) {
		int sum;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + " ");
			}
			System.out.println();
		}
	}
}
