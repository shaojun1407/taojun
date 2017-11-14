<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.util.javaweb.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息表</title>
</head>
<body>
<form method="post" action="stu1.jsp" >
   <table>
       <tr>
      <td style="text-align:center;"><b>请输入要添加用户的信息</b></td>
       <tr>
       <td>&nbsp&nbsp</td>
       <td>&nbsp&nbsp</td>
       <td>&nbsp&nbsp</td>
       <td>&nbsp&nbsp</td>
       <td>&nbsp&nbsp</td>
       <td>&nbsp&nbsp</td>
       </tr>
       </tr>
          <tr>
            <td>姓名&nbsp&nbsp&nbsp&nbsp&nbsp<input name="sname"/></td><br/>
          </tr>   	    	
          <tr>
            <td>年龄&nbsp&nbsp&nbsp&nbsp&nbsp<input name="sage"/></td><br/>
          </tr>   	    	
          <tr>
            <td>手机号&nbsp&nbsp<input name="scell"/></td><br/>
          </tr>   	    	
</table>
           &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input name="shanchu" type="submit" value="提交" style="text-align:center;"  />
            <input name="shanchu" type="reset" value="重置" style="text-align:center;"  />
  </form>
</body>
</html>