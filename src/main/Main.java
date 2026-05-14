
package src.main;

import java.util.Scanner;
import src.models.Student;
import src.Verb.Course;
import src.Verb.WrongInputException;

public class Main {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        int choice;
        Course c = new Course("CS101", "Intro to Computer Science");

        do {
            System.out.println("1.Add student");
            System.out.println("2.Add Gpa");
            System.out.println("3.Display students");
            System.out.println("4.Search");
            System.out.println("0.Exit");
            choice= pk.nextInt();
            pk.nextLine();
        try {
            switch(choice){
            case 1:
                System.out.println("Enter id");
                String id = pk.nextLine();

                System.out.println("Enter name");
                String name = pk.nextLine();

                System.out.println("Enter email");
                String email = pk.nextLine();

                System.out.println("Major?");
                String major = pk.nextLine();

                Student p = new Student(id, name, email, major);
                c.addStudent(p);
                break;

            case 2:
                System.out.println("Enter student Id");
                String studentid = pk.nextLine();
               Student K= c.findStudent(studentid);
                if(K == null){System.out.println("Student not found");}
                System.out.println("Enter Gpa");
                double gpa = pk.nextDouble();
                pk.nextLine(); 
                studentid.addGpa
                break;
            case 3:
                c.listStudents();
                break;
            case 4:
                System.out.println("Enter student ID");
                String studentId = pk.nextLine();
                c.searchStudent(studentId);
                break;
            }
        }   
            catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");

            }

    } while (choice != 0);
      
        pk.close();
    }
}
