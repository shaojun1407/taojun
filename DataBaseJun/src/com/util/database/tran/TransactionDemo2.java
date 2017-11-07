package com.util.database.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/shao";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 注册成功
		// 方式一Class.forName("com.mysql.jdbc.Driver");
		Class.forName(DBDRIVER);// 方式二

		// 建立数据库连接
		Connection conn = null;
		Statement st=null;
		Statement sp=null;    //设置保存点标记
		try {
			//建立数据库连接
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		// 关闭自动提交功能
		conn.setAutoCommit(false);
		// 创建statement
		st =conn.createStatement();
		String sql="insert into stu (age ,name,cell,id) values";
			st.executeUpdate(sql + "('23','us01','18256034508','23')");
			st.executeUpdate(sql + "('28','us02','18256034507','24')");
			sp=(Statement) conn.setSavepoint();  //设了一个保存点
		// 制造错误
		st.executeUpdate(sql + "('24','us04','18256034505','26')");
		st.executeUpdate(sql + "('29','us05','18256034504','27')");
		sp=(Statement) conn.setSavepoint();    //设了一个保存点
		st.executeUpdate(sql + "('26','us03','18256034506’,'25')");    //有错误的一行
		st.executeUpdate(sql + "('28','us06','18256034503','28')");
		sp=(Statement) conn.setSavepoint();    //设了一个保存点
		// 执行SQL语句
		st.executeUpdate(sql);
		conn.commit();
		// 数据输出完毕
		System.out.println("数据插入完毕！");
		} catch (Exception e) {
			//出现异常回滚
			//conn.rollback();
			conn.rollback((Savepoint) sp);
			conn.commit();
			System.out.println("出现异常，进行回滚");
		}finally{
			// 释放资源
		st.close();
		conn.close();
		System.out.println("释放资源");
		}
	}
}
