package com.shao.Ioc.set;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Getter;
import lombok.Setter;

public class BoySetter {
	private static Logger logger=Logger.getLogger(BoySetter.class);
	//声明接口类型的引用，如具体实现类解耦合
	@Getter@Setter
	private GirlFriend grilFriend;
	private static ApplicationContext ctx;
	private static void main(String[] args) {
		ctx =new ClassPathXmlApplicationContext("ApplicationContext-Set.xml");
		BoySetter boy=(BoySetter) ctx.getBean("boySetter");
		logger.info(boy.grilFriend.speak());
	}

}
