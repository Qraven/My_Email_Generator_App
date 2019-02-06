/*
This is a simple app made in Java by Qraven. It can be used to generate email addresses and creating random passwords. Hope you enjoy!
*/
public class Main {

    public static void main(String[] args){

        Email em1 = new Email("Jimmy", "Bronco"); //Creating Email
        em1.createDepartment(); //Asking and creating department code
        em1.createEmail(); //Creating email from a given data
        em1.passwordRandom(10); //Creating a random password

    }
}