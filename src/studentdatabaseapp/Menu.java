package studentdatabaseapp;
import java.util.Scanner;


public class Menu extends StudentDatabaseApp {
     public String courses ="";

        public Menu(){


        }

        //enroll in course

            public void enroll () {
                // get inside a loop and user hits 0 when done enrolling
                do {
                    System.out.print("Enter name of course to enroll and enter Q anytime to quit: ");
                    Scanner in = new Scanner(System.in);
                    String course = in.nextLine();

                    if (!course.equals("Q")) {
                        courses = courses + "\n" + course;
                        tuitionBalance = tuitionBalance + costOfCourse;

                    } else {

                        break;

                    }
                } while (1 != 0);


                System.out.println("You are Enrolled in: " + courses);
                System.out.println("Tuition balance: " + tuitionBalance + "$");
            }

            //view balance

            public void viewBalance () {

                System.out.println("Your Balance is: " + tuitionBalance + "$");
            }

            //pay tuition
            public void payTuition() {
                viewBalance();
                System.out.println("Enter your payment amount in US $:");
                Scanner in = new Scanner(System.in);
                int payment = in.nextInt();
                tuitionBalance = tuitionBalance - payment;
                System.out.println("Thank you of your payment of: " + payment + "$");
                viewBalance();
            }

            //show status
              public String showStatus(){
                  return "Name: " + firstName + " " + lastName + "\n" +
                          "\nGrade level: " + gradeYear +
                          "\nStudent ID: " + studentId +
                          "\nCourses Enrolled: " + courses +
                          "\nBalance: " + tuitionBalance + "$";
                }


            }




