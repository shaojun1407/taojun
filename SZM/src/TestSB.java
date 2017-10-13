import java.util.Scanner;

public class TestSB {

	public static void main(String[] args) {
		Studentlizi sb =new Studentlizi();
//		Scanner input =new Scanner(System.in);
//		for (int i=0;i<5;i++) {
//			System.out.println("请输入第"+(i+1)+"个性名:");
//			String name =input.nextLine();
//			sb.addName(1, name);
//		}
//		sb.showNames();
		boolean finded = sb.searchName(2, 5, "赵高");
		if(finded) {
			System.out.println("找到了！");
		}else{
			System.out.println("没找到该学生！");
		}

	}

}
