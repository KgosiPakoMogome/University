
import java.util.ArrayList;
public class Course{
    private Lecturer lecturer;
    private String courseCode;
    private String courseName;
    private ArrayList<Student> students; 
    
    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
       students = new ArrayList<>();

    }
    public void  addStudent(Student s){
        students.add(s);
    }
    
    public void listStudents(){
        for (Student s : students){
            System.out.println(s.getDetails());
        }
    }
}