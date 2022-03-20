package studentdatabaseapp;
import java.util.Scanner;

public class Student extends Menu {


    // Constructor: prompt user to enter student's name and year
    public Student() {



        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: "); //ask user for firstName
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: "); // ask user for lastName
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: "); //ask user for graduation year
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println("Name: " + firstName + " " + lastName + "\n" + "Level: "+ gradeYear + "\n" + "Student id: " +studentId);



    }
    // generate an id
    public void setStudentID(){
        // Grade level + ID
        id++; //increment id by one everytime we add new student
        this.studentId = gradeYear + "" + id;
    }
    // enroll in courses


    }

    // view balance
    // pay tuition
    // show status


