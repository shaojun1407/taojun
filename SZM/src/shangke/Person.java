package shangke;

public class Person {
	private String name ="zhangsan";
	private int age =0;
	private String sex ="男";
	public void setSex(String sex)throws Exception{
		if("男".equals(sex)||"女".equals(sex))
			this.sex=sex;
		else {
			throw new Exception("性别必须是\"男\"或者\"女\"!");
		}
		
	}
			 

}
