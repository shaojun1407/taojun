package annotation;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Human {
	private int score = 60;

	@HelloWorld("学生")
	private String desc;// 描述信息
	@HelloWorld
	private String info = "AAA";
	@HelloWorld("50")
	private String java2;

	@Override
	public String say() {
		return "Student say()...";
	}

	// @SupperssWarnings("unchecked")
	@SuppressWarnings(value = "all")

	public static void main(String[] args) {
		// @SupperWarnings("rawtypes")
		List list = (List) new ArrayList();
		((ArrayList) list).add("AA");
		Student student = new Student();
		// @SupperWarnings("rawtypes")
		List list1 = (List) new ArrayList();
		((ArrayList) list1).add("BB");
		String java2 = new String();

	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", desc=" + desc + ", info=" + info + ",java2=" + java2 + "]";
	}

}
