package com.shao.Ioc.set;

import lombok.Getter;
import lombok.Setter;

public class ChinaGirlFriend implements GirlFriend {
	
	
	@Getter@Setter
	private String language;
	public String speak() {
		return language;
	}

}
