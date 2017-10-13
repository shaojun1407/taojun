package com.tsj.demo;

public class Birthday {

		private int day;
		private int month;
		private int year;
		/*
		 * 值传递，参数为基本类型
		 * @param  year
		 * @param month
		 * @param day
		 */
	

      public void display(int year,int month,int day) {
    	  day = 11;month =11;year =2015;
    	  System.out.println("传递方法中："+year+"-"+month+"-"+day);
      }  
      /*
       * 引用传递，传递的是引用类型
       * @param birthday
       */
        public void display(Birthday birthday) {
        	birthday.year =2012;
        	birthday.month =12;
        	birthday.day =12;
        	System.out.println("传递方法中："+ birthday.year+"-"+birthday.month+"-"
        			+"-"+birthday.day);
        	 }
        /*
         * 
         */
        public static void testValue1(){
        	
        	Birthday birthday = new Birthday();
        	//
        	int day =12,month =12,year =2016;
        	//
        	System.out.println("传递之后："+year+ "-"+month+"-"+day);
          } 
        public static void testValue2() {
        	Birthday birthday = new Birthday();
        	birthday.day =3;
        	birthday.month =3;
        	birthday.year =2016;
        	System.out.println("传递之前："+ birthday.year+"-"
        			+birthday.month+"-"+birthday.day);
        	birthday.display(birthday);
        	System.out.println("传递之后："+birthday.year+"-"+
        	birthday.month+"-"+birthday.day);
      
        }
	
        public static void main(String[] args) {
        	testValue1();
        	
        	
        }
        
}
