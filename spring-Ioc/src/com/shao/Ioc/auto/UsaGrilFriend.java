package com.shao.Ioc.auto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Service("usaGrilFriend")
//@Controller("usaGrilFriend")
@Component("usaGrilFriend")
public class UsaGrilFriend {
public String speak() {
	return" english";
}
}
