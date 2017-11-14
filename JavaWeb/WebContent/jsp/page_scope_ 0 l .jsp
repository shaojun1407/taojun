<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*"%>
@getter@setter
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%// 设置page 属性范围，此属性只在当前的JSP 页面申起作用
pageContext.setAttribute("name","李兴华");
pageContext.setAttribute("birthday",new Date());
%>
<% // 从page 属性范围中取出属性，并执行向下转型操作
String usemame = (String)pageContext.getAttribute("name");
Date userbirthday = (Date)pageContext.getAttribute("name");
%>
<h2>姓名:<%=usemame%></h2>
<h2>生日:<%=userbirthday%></h2>
</body>
</html>