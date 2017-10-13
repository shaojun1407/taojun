package shangke;

public class TestInteres {

	public static void main(String[] args) {
//		int ret =test1();
//		System.out.println("ret = "+ret);//返回的是1，不是2
//
//	}
//	public static int test1() {
//		int a =1;
//		try {
//			return a;
//		}
//		finally {
//			++a;
//			System.out.println("a = "+a);//确定语句块是否执行
//		}
//	}
	int ret =test1();
	System.out.println("ret ="+ret);//返回的是1，不是2
	}
	public static int test1() {
		int a=1;
		try {
			return a;
		}
		finally {
			++a;
			System.out.println("a="+a);//确定语句块是否执行
		}
	}
}
