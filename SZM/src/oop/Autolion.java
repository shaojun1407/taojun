package oop;

public class Autolion {
	String color ="黄色";
	public void run() {
		System.out.println("正在以0.1米/秒的速度向前奔跑");
	}  
	  public String bark() {
		 String sound ="大声吼叫";
		 return sound;
	  }
	  public String getColor() {
		  return color;
	  }
	  public String showLion() {
		  return "这是一个"+getColor()+"的玩具狮子";
	  }

}
