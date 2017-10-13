package annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
	private String name;
	private String java;
	@Deprecated
	private Integer age;

	@Deprecated
	public String say() {
		return "Human say()...";
	}

}
