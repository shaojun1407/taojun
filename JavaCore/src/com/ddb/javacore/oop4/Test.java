package com.ddb.javacore.oop4;

import com.ddb.javacore.oop3.Dog;
import com.ddb.javacore.oop3.Penguin;
import com.ddb.javacore.oop3.Pet;

public class Test {

	public static void main(String[] args) {
		//创建两个宠物对象
//		Dog dog = new Dog();
//		Penguin penguin = new Penguin();
		
		Pet dog = new Dog();	//dog的类型是Pet，指向的是Dog类的一个实例对象
		Pet penguin = new Penguin();
		Pet cat = new Cat();
		
		//通过主人类给宠物喂食
		Master master = new Master();
		master.feed(dog);
		master.feed(penguin);
		master.feed(cat);
		
		//领取宠物
//		Pet dog1= master.getPet("dog");
//		Pet cat1= master.getPet("cat");
//		Pet penguin1= master.getPet("penguin");
//		dog1.eat();
//		cat1.eat();
//		penguin1.eat();
		
		//和宠物玩耍
		master.play(dog);
		master.play(cat);
		master.play(penguin);	
	}

}
