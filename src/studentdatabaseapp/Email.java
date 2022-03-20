package studentdatabaseapp;

public class Email extends StudentDatabaseApp {

    public String password;



    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Your password is: " + this.password);
    }


    public static String randomPassword(int length){

        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!@#$%&*";
        char[] password = new char[length];
        for (int i=0; i<length; i++ ){
            int rand = (int) (Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //ask for the department
    //generate a password
    //set the mail capacity
    //set alternate email
    //change the password
}
