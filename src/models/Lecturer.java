package src.models;
public class Lecturer extends Person{
    private String department;
    private double salary;

    public Lecturer (String id, String name, String email, String department,double salary){
        super(id, name, email);
        this.department  = department;
        this.salary = salary;
    }
    public void increaseSalary(double amount){
        this.salary += amount;
    }
    

    @Override
    public String getDetails(){
        return super.getDetails() + " Department: " + department + " Salary: " + salary;
    }
}

