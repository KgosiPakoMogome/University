package src.models;

public class Student extends Person{
    private String major;
    private double gpa;

    public Student (String id,String name,String email, String major){
        super(id, name, email);
        this.major = major;
        this.gpa = 0.0;
    }
    public void SetGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }
        else{
            this.gpa = 0.0;
        }
    }

    public void updateGPA(double newgpa){
        this.gpa = newgpa;
    }
    @Override
    public String getDetails(){
        return super.getDetails() + " Major: " + major + " GPA: " + gpa;
    }
}
