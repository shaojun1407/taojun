package stuinfo;
import java.util.List;
 
import com.util.Student;
 
public interface IStuDao {
    /**
     * 新增一个学生
     * @param stu
     */
    public void addstu(Student stu);
    /**
     * 修改一个学生
     * @param stu
     */
    public void updatestu(Student stu);
    /**
     * 通过ID删除一个学生
     * @param id
     */
    public void delstu(int id);
    /**
     * 找到所有的学生
     * @return 返回一个集合
     */
    public List<Student> findall();
    /**
     * 通过id找到一个学生
     * @param id
     * @return
     */
    public Student findStubyId(int id);
 
}