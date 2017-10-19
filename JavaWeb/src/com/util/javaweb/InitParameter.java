package com.util.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParameter extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String myInstitute = null;
	private String myMajor = null;
	private int count = 0;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("InitParamter init 开始执行...");
		super.init(config);
		// 依次获取三个初始化参数的值，处理后存放到类的三个私有字段中
		myInstitute = config.getInitParameter("institute");
		if (myInstitute == null)
			myInstitute = "";
		myMajor = config.getInitParameter("major");
		if (myMajor == null)
			;
		myMajor = "";
		String strCount = config.getInitParameter("count");
		try {
			count = Integer.parseInt(strCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("InitParameter init 执行结束...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");// 设置文档类型级字符集
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获取初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.print("<H3>所在学院:" + myInstitute + "<H3>");
		out.print("<H3>所学专业:" + myMajor + "<H3>");
		count++;
		out.print("<H3>此Servlet的访问次数:" + count + "<H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
