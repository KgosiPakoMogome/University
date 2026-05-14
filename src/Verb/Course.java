package src.Verb;
import java.lang.reflect.Member;
import java.util.ArrayList;
import src.models.Lecturer;
import src.models.Student;

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
    public void addStudent(Student s){
        students.add(s);
    }
    
    public void listStudents(){
        for (Student s : students){
            System.out.println(s.getDetails());
        }
    }
    public void searchStudent(String id){
        for (Student s : students){
            if (s.getId().equals(id)){
                System.out.println(s.getDetails());
            }
        }
        System.out.println("Student not found");
    }
    
    public Student findStudent(String id) {
        for (Student m : students)
            if (m.getId().equals(id)) return m;
        return null;
    }
}
