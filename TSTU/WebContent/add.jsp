<%@ page import="java.util.*" pageEncoding="UTF-8"%>  
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
  <head>  
    <title></title>  
  </head>  
  <!-- JavaScript是搭配HTML使用的脚本代码,可以帮助我们操作HTML内容和浏览器本身 -->  
  <!-- JavaScript可以做很多很多事情，甚至可以用来编写游戏和强大的基于浏览器的应用  
  然而更普遍的功能是利用JavaScript帮助我们进行表单验证,确保提交的数据是符合服务器业务处理要求的 -->  
  <script type="text/javascript">  
    function myReset(){  
        //将浏览器导航为index.jsp,location.href属性可以更改当前浏览器地址栏的内容  
        location.href="index.jsp";  
        //window.location.href="index.jsp";  
   
    }  
    //mySubmit方法用于提交表单，并且在提交之前验证表单数据的格式是否符合要求  
    function mySubmit(){  
        //先来个简单的,验证姓名必须有填写，不能为空  
        //首先获取姓名输入框的数据  
        //document是文档对象，代表整个HTML页面  
        //forms是表单集合，如果存在多个表单的话,索引从0开始，并且是从上往下编号   如果表单有表单名可以用<span style="font-family:FangSong_GB2312;"><strong>document.表单名.控件名.value </strong></span>  
        //user_name是表单下控件的名字  
        //value是获取这个控件的value值  
        //length是一个属性，返回长度  
        //var是变量，JavaScript是弱类型语言,也就是说不区分int,double,Object这些类型  
        //而是统一使用var表示  
        var name=document.forms[0].user_name;  
               //通过document.getElementById（“id名”） 可以获取非<input /> 中的内容，但是dojsp无法获取           
                var name_msg=document.getElementById("name_msg");  
        var hobby_msg=document.getElementById("cell_msg");  
        name_msg.innerHTML="";  
        cell_msg.innerHTML="";  
        if(name.value.length==0){  
            //提示用户  
            //alert("姓名为必填项");  
            name_msg.innerHTML="<font color='red'>*姓名为必填项</font>";  
            //聚焦（鼠标定位）  
                        name.focus();  
            return ;//中断方法的运行  
        }  
        //对于多选的控件判断会稍微麻烦点点哦  
        var cell_item=document.forms[0].user_cell;  
        var flag=false;  
        for(var i=0;i<cell_item.length;i++){  
            if(cell_item[i].checked==true){  
                flag=true;  
                break;  
            }  
        }  
        if(flag==false){  
            //alert("至少选择一个爱好");  
            cell_msg.innerHTML="<font color='red'>*至少有一个号码</font>";  
            return ;  
        }  
        document.forms[0].submit();//submit是提交方法  
    }  
  </script>  
  <body>  
    <h1 align="center">请输入要添加用户的信息</h1>  
    <form action="doadd.jsp" method="post" >  
        <table align="center" width="50%">  
            <!-- 姓名 -->  
            <tr>  
                <td align="right" width="37%">姓名:</td>  
                <td align="left" width="25%"><input type="text" name="user_name" ></td>   
                <td>  
                    <div id="name_msg" align="left"></div>  
                </td>  
            </tr>  
            <!-- 年龄 -->  
            <tr>  
                <td align="right">年龄:</td>  
                <td align="left" colspan="2"><select name="user_age">  
                <% for(int i=18;i<=30;i++){%>  
                    <option value="<%=i%>" ><%=i%></option>  
                <%} %>  
                </select></td>   
            </tr>  
            <!-- 性别 -->  
            <tr>  
                <td align="right">性别:</td>  
                <td align="left" colspan="2"><input type="radio" name="user_sex" value="男" checked="checked">男  
                <input type="radio" name="user_sex" value="女" />女</td>   
            </tr>  
            <!-- 手机号 -->  
            <tr>  
                <td align="right">手机号:</td>  
                <td align="left"><input  type="text" name="user_cell"/></td>
                <td>  
                    <div id="cell_msg"></div>  
                </td>  
            </tr>  
            <!-- 按钮 -->  
            <tr>  
                <td align="center" colspan="3">  
                    <input type="submit" value="提交" onclick="mySubmit()">  
                          
                    <input type="reset" value="重置"  onclick="myReset()">  
                </td>  
            </tr>  
        </table>  
    </form>  
  </body>  
</html>  