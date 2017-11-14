package stuinfo;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Student;

 
public class studentServlet extends HttpServlet {
 
     
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IStuDao sd = new StuDaoImpl();
        String op = request.getParameter("op");
        if(op==null)    op = "list";
        if("list".equals(op)){
            //接收 显示所有的请求信息
            List<Student> list = sd.findall();
            request.setAttribute("list", list);
            response.sendRedirect("studentlist.jsp");
            return ;
        }else if("add".equals(op)){
            //若是新增,则跳转到新增界面处理
            response.sendRedirect("studentadd.jsp");
            return ;
        }else if("edit".equals(op)){
            //取到要编辑的数据，然后 若command=view 则转向view.jsp;否则跳转到编辑页面
            String id = request.getParameter("id");
            //System.out.println(id);
            Student s = sd.findStubyId(Integer.parseInt(id));
            request.setAttribute("stu", s);
            String command = request.getParameter("command");
            if("view".equals(command)){
                request.getRequestDispatcher("studentedit.jsp").forward(request, response);
                //response.sendRedirect("studentedit.jsp");
                return ;
            }else{
                response.sendRedirect("studentview.jsp?id="+id);
                return ;
            }
             
             
        }else if("delete".equals(op)){
            //删除数据，然后跳转到列表页面
            //1.获取参数值
            String id =request.getParameter("id");
             
            //2.调用dao删除指定的数据
            sd.delstu(Integer.parseInt(id));
             
            //3.通过response返回到列表页面
            response.sendRedirect("studentServlet?op=list");
             
            return ;
        }else if("store".equals(op)){
            //若是新增，则add；若是编辑，则调用update;然后跳转到列表页面
            //1.获取参数值
            String id =request.getParameter("id");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String classes = request.getParameter("class");
            System.out.println(id+name+age);
            System.out.println(classes+"sssssssssssssss");
            //2.封装成对象
            Student obj =new Student();
 
            obj.setName(name);
            obj.setAge(Integer.parseInt(age));
            obj.setClasses(classes);   
             
            if(id==null||"".equals(id)){
                //新增
                sd.addstu(obj);    
                //System.out.println("sssssssssssssssssss");
                 
            }else{
                //编辑
                obj.setId(Integer.parseInt(id));
                sd.updatestu(obj);             
            }
            response.sendRedirect("studentServlet?op=list");
            return ;
        }      
    }
 
     
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request,response);
         
    }
 
}