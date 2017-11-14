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
<form method="post" >
   <table>
       <tr>
      <td style="text-align:center;"><b>更新用户的信息</b></td>
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
            <td>需要更新的id:&nbsp&nbsp<input name="sname"/></td><br/>
          </tr>   	    	
          <tr>
            <td>更新后的姓名:&nbsp&nbsp<input name="sname"/></td><br/>
          </tr>   	    	
          <tr>
            <td>更新后的年龄:&nbsp&nbsp<input name="sname"/></td><br/>
          </tr>   	    	
          </tr>   	    	
          <tr>
            <td>更新后手机号:&nbsp&nbsp<input name="sname"/></td><br/>
          </tr>   	    	
</table>
           &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 
           <input name="shanchu" type="submit" value="提交" style="text-align:center;"  action="stu.jsp" />
            <input name="shanchu" type="submit" value="重置" style="text-align:center;"  action="stu2.jsp"/>
  </form>
</body>
</html>