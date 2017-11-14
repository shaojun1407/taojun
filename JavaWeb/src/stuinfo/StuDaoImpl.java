package stuinfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
import com.util.Student;

public class StuDaoImpl implements IStuDao {

    public void addstu(Student stu) {
        // TODO Auto-generated method stub
        String s1 = "INSERT INTO student (id,name,age,class) VALUES(?,?,?,?)";
        try {
            Connection con = Student.getconnection();
            PreparedStatement prep = con.prepareStatement(s1);
            prep.setInt(1, stu.getId());
            prep.setString(2, stu.getName());
            prep.setInt(3, stu.getAge());
            prep.setString(4, stu.getClasses());
            prep.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

        	Student.release();
                 }

} 
public void updatestu(Student stu) {
          String s1 = "update student set name=?,age=?,class=? where id=?"; 
          try {
             Connection con = Student.getconnection(); 
             PreparedStatement prep = con.prepareStatement(s1);
             prep.setInt(4, stu.getId()); //第4个问号的值
             prep.setString(1, stu.getName()); 
             prep.setInt(2, stu.getAge()); 
             prep.setString(3, stu.getClasses()); 
             prep.executeUpdate(); 
             } catch (SQLException e) { 
                 e.printStackTrace();
             }finally{

            	 Student.release();
          }

} 


public void delstu(int id){ 
      String s5 = "delete from student where id =?" ; 
      Connection con = null; 
      try { 
         con = Student.getconnection(); 
         PreparedStatement prep = con.prepareStatement(s5);
         prep.setInt(1,id); 
         prep.executeUpdate(); 
        } catch (SQLException e) { 
          e.printStackTrace();
        }finally{

        	Student.release();
                 }
        
        

    }

    public List<Student> findall() {
        
        String s2 = "select * from student";
        Connection con = null;
        List<Student> list = new ArrayList();
        try {
            con = com.util.Student.getconnection();
            PreparedStatement ps = con.prepareStatement(s2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(toStu(rs));
            }
        } catch (SQLException e) {
        
            e.printStackTrace();
        }finally{

        	Student.release();
                 }

         return list; 
         }
    
    
//将一行数据封装成一个对象
 private Student toStu(ResultSet rs) throws SQLException { 
        Student s = new Student(); 
        s.setId(rs.getInt("id")); 
        s.setName(rs.getString("name")); 
        s.setId(rs.getInt("age")); 
        s.setClasses(rs.getString("class")); 
        return s; 
     } 
public Student findStubyId(int id) {
     String s3 = "select * from student where id =" + id;
     Connection con = null; 
     PreparedStatement ps = null;
     ResultSet rs = null; 
     List<Student> li = new ArrayList();
    try { 
    con = com.util.Student.getconnection(); 
    ps = con.prepareStatement(s3); 
    rs = ps.executeQuery();
     while (rs.next()) {
         return toStu(rs); 
    }  } catch (SQLException e) { // TODO Auto-generated catch block
       e.printStackTrace(); 
    }finally{
    	Student.release();
      }
       return null;
}
}