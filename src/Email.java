import java.util.Scanner;

import static java.lang.Math.random;

public class Email
{
    private String firstName;
    private String lastName;
    private String email;
    private int departmentNumber;
    private String department;
    private String alternateEmail;
    private int mailCapacity;

    Scanner sc = new Scanner(System.in);

    //Creating an email constructor
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Asking for department
    public void createDepartment()
    {
        System.out.println("What is your department \n1 For Sales \n2 For Development \n3 For Accounting \n0 For None");
        departmentNumber = sc.nextInt();

        if(departmentNumber == 0)
        {
            department = "";
        } else if(departmentNumber == 1)
        {
            department = "sales";
        } else if(departmentNumber == 2)
        {
            department = "development";
        } else if(departmentNumber == 3)
        {
            department = "accounting";
        }

    }

    //Creating email
    public void createEmail()
    {
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "." + department  + "@" + "email.com";
        System.out.println("Twoj email to:");
        System.out.println(email);
    }

    //Creating a random password
    public void passwordRandom(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ1234567890!@#$%";

        char[] password = new char[length];

        for(int i =0; i<length; i++)
        {
            int randomizer = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomizer);
        }
        //Returning the password
        System.out.println("Twoje hasło to:");
        System.out.println(password);
    }

}
