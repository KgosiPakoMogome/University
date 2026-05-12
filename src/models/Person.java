package src.models;

public class Person{
    private String id;
    private String name;
    private String email;

    public Person (String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
 
    public String getDetails(){
        return " Id " + id + " Name " + name + " Email " + email;
    }
}
