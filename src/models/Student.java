package src.models;

public class Student extends Person{
    private String major;

    public Student (String id,String name,String email,String major){
        super(id, name, email);
        this.major = major;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + " Major: " + major;
    }
}
