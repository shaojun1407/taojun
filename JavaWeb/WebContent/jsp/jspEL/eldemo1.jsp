<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%Cookie cookie1=new Cookie("country","chn");
cookie1.setMaxAge(120);
response.addCookie(cookie1);
%>
</head>
<!--获取cookie:  -->
<hr/>
${'${'}cookie.country.name}:${cookie.country.name}<br/>
${'${'}cookie.country.value}:${cookie.country.value}<br/>
${cookie['country'].name}<br/>
${cookie['country'].value}<br/>

<body bgcolor='${pageScope.color}' text="${pageScope.textclr}">
	<h1>Use of implicit objects in EL.</h1>
	<Font color="${pageScope.foregr}" size="${pageScope.size}">修改背景色和文本色</Font>
	<br /> value of num1=${pageScope.num1}
	<br /> value of num2=${pageScope.num2}
	<br /> value of num1=
	<b>${pageScope.num1}</b>*num2=
	<b>${pageScope.num2}</b>=
	<b>${pageScope.num1*pageScope.num2}</b>

</body>
</html>