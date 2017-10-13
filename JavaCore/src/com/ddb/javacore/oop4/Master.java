package com.ddb.javacore.oop4;

import com.ddb.javacore.oop3.Dog;
import com.ddb.javacore.oop3.Penguin;
import com.ddb.javacore.oop3.Pet;

public class Master {

	// public void feed(Dog dog ) {
	// dog.eat();
	// }
	//
	// public void feed(Penguin penguin ) {
	// penguin.eat();
	// }
	// 其他的宠物的，增加喂食方法即可！

	// 使用多态的方式
	public void feed(Pet pet) {
		pet.eat();
	}

	// 领养宠物的方法
	public Pet getPet(String typeId) {
		Pet pet = null;
		switch (typeId) {
		case "dog":
			pet = new Dog();
			break;
		case "cat":
			pet = new Cat();
			break;
		case "penguin":
			pet = new Penguin();
			break;
		}
		return pet;
	}

	// 添加和宠物玩耍的方法
	public void play(Pet pet) {
		// 在父类向子类转换的过程中，要转换为它的真实类型
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin penguin = (Penguin) pet;
			penguin.swimming();
		} else if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.catchMouse();
		}

	}

}
