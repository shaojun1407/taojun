package enumdemo;

enum MYColor{红色,绿色,蓝色};
public class enumswitch {

	public static void main(String[] args) {
		MYColor c1=MYColor.绿色;//定义MYColor枚举变量c1，并赋值为"绿色"
		switch(c1) {
		case 红色:{
			System.err.println("我是红色!");
			break;
		}
		case 绿色:{
			System.out.println("我是绿色!");
			break;
		}
		case 蓝色:{
			System.out.println("我是蓝色!");
			break;
		}
		}
		

	}

}
