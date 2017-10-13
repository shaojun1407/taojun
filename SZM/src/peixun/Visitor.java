package peixun;
public class Visitor {
//	String name;	//姓名
//	int age;		//年龄
//	//显示信息方法
//	public void show(){
//			if(age>=18 && age<=60){		//判断年龄
//				System.out.println(name+ "年龄为"+age+ ",价格为20元" );
//			}else{
//				System.out.println(name + "的年龄为："+age+"，免费");
//			}
//		//……
//	}
	String name ;
	int age;
	//显示信息方法
	public void show() {
		if(age>=18 && age<=60) {
			System.out.println(name+"年龄为 "+age+",价格为20元");
		}  else {
			System.out.println(name+"年龄为 :"+age+".免费");
		}
	}
}
