package collection;

import java.util.ArrayList;

import arraydemo.Dog;

public class ArrayListdDmeo {

	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧");
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		// 向容器中添加元素
		dogs.add(ououDog);
		dogs.add(new Dog("yaya"));
		dogs.add(new Dog("meimei"));
		dogs.add(0, new Dog("awang")); // 在指定的位置添加元素
		System.out.println("共有：" + dogs.size() + "条狗狗！");
		printlist(dogs);
		Dog yayaDog = new Dog("yaya");
		// 判断是否包含指定的狗狗
		if (dogs.contains(yayaDog)) {
			System.out.println("容器中包含指定的狗狗");

		} else {
			System.out.println("容器中不包含指定的狗狗");
		}
		// 删除容器中第二个元素
		System.out.println("删除容器中第二个元素");
		dogs.remove(1);
		printlist(dogs);
		// 删除指定的狗狗
		System.out.println("删除指定的ouou狗狗");
		dogs.remove(ououDog);
		printlist(dogs);

	}

	private static void printlist(ArrayList<Dog> dogs) {
		// TODO Auto-generated method stub

	}

}
