import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        
        int choice;
        Course c = new Course("CS101", "Intro to Computer Science");
        
        do{
        System.out.println("Enter id");
        String id = pk.next();

        System.out.println("Enter name");
        String name = pk.next();

        System.out.println("Enter email");
        String email = pk.next();

        System.out.println("Major?");
        String major = pk.next();
        
        System.out.println("GPa?");
        double gpa= pk.nextDouble();

        Student p = new Student(id, name, email,major, gpa);
        c.addStudent(p);

        System.out.println(" Add another student");
        choice =pk.nextInt();

        }while(choice != 0);        
           
        c.listStudents();

    }
}
private static void inputValidation(int choice) throws WrongInputException{
        if (choice < 0 || choice > 1) {
            throw new WrongInputException("Choice must be 0 or 1");
    }
}