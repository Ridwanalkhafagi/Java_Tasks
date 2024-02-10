package jd_08;

import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstname = input.next();

        System.out.println("Enter last name: ");
        String lastname = input.next();

        input.close();
        String lowerCase1 = firstname.toLowerCase();
        String lowercase2 = lastname.toLowerCase();
        String correctFormat1 = lowerCase1.substring(0,1).toUpperCase() + lowerCase1.substring(1);
        String correctFormat2 = lowercase2.substring(0,1).toUpperCase() + lowercase2.substring(1);

        System.out.println(correctFormat1 + " " + correctFormat2);
    }
}
