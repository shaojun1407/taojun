package com.util.database.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class stu4info {
	public static final String DBDRIVER= "com.mysql.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/shao";
    public static final String DBUSER="root";
    public static final String DBPWD="root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//注册成功
		//方式一Class.forName("com.mysql.jdbc.Driver");
		Class.forName(DBDRIVER);//方式二
		
		//建立数据库连接
		Connection conn=null;
		conn=DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		
		//创建statement
		Statement st=conn.createStatement();
		String sql ="select * from stu";
		
		//执行SQL语句
		ResultSet rs=st.executeQuery(sql);
		
		System.out.println("age \t\t name \t\t cell \t\t id \t\t ");
		//循环处理执行结果集
		while(rs.next()) {
		//取得每一条记录中的数据
		int age =rs.getInt("age");
		String name =rs.getString("name");
		String cell=rs.getString("cell");
		int id=rs.getInt("id");
		
		//输出我们的每一条记录
		System.out.println(age+"\t\t"+name+"\t\t"+cell+"\t\t"+id+"\t\t");
		}
        //数据输出完毕
		System.out.println("数据输出完毕！");
		
		//释放资源
		rs.close();
		st.close();
		conn.close();
			}

	private static void where(boolean next) {
		// TODO Auto-generated method stub
		
	}

}
