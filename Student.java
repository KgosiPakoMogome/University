
public class Student extends Person{
    private String major;
    private double gpa;

    public Student (String id,String name,String email, String major,double gpa){
        super(id, name, email);
        this.major = major;
        this.gpa = gpa;
    }

    public void updateGPA(double newgpa){
        this.gpa = newgpa;
    }
    @Override
    public String getDetails(){
        return super.getDetails() + " Major: " + major + " GPA: " + gpa;
    }
}