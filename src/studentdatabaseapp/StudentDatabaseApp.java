package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

    public String firstName; //using private for encapsulation purposes
    public String lastName;
    public int gradeYear;
    public String studentId;
    public String password;
    public int defautPasswordLength;
   // public static String courses = null;

    public static int tuitionBalance;
    public static int costOfCourse = 600;
    public static int id = 1000;

    public static void main(String[] args){


        // ask how many users we want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Menu[] students = new Student[numOfStudents];

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++){

            students[n] = new Student();

            students[n].enroll(); // calling enroll method
            students[n].payTuition();
            //Email.randomPassword(int length);
            System.out.println(students[n].showStatus());



        }
    }
}
