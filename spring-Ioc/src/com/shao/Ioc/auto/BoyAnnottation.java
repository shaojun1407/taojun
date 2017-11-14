package com.shao.Ioc.auto;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BoyAnnottation {
	private static Logger logger=Logger.getLogger(BoyAnnottation.class);
	//@Autowired
	private UsaGrilFriend usaGrilFriend;
	private static ApplicationContext ctx;
	public UsaGrilFriend getUsaGrilFriend() {
		return usaGrilFriend;
	}
	//@Resource(type =UsaGrilFriend.class)
	@Resource(name="usaGrilFriend")
	public void setUsaGrilFriend(UsaGrilFriend usaGrilFriend) {
		this.usaGrilFriend=usaGrilFriend;
		
	}
	public static void main(String []args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext-auto.xml");
		BoyAnnottation boy=(BoyAnnottation)ctx.getBean("boyAnnottation");
		logger.info(boy.usaGrilFriend.speak());
	}

}
