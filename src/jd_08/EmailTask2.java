package jd_08;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you email address: ");

        String email = input.next();
        String lower = email.toLowerCase();
        System.out.println(lower);

        String firstName = lower.substring(0, lower.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1);
        String lastName = lower.substring((lower.indexOf("_")+ 1), lower.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        String domain = lower.substring(lower.indexOf("@")+1, lower.indexOf("."));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);



    }
}
