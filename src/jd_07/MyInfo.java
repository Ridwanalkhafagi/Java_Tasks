package jd_07;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your gender");
        String gender = scanner.next();
        scanner.nextLine();

        System.out.println("Enter your full name");
        String name = scanner.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scanner.nextLine();

        System.out.println("Enter your city name");
        String cityName = scanner.nextLine();

        System.out.println("Enter your state name");
        String stateName = scanner.next();

        System.out.println("Enter your building number");
        int buildingNumber = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your street name");
        String streetName = scanner.nextLine();



        System.out.println(name + "\n" + age + "\n" + gender + "\n"
        + phoneNumber + "\n" + "Address:\n\t" + buildingNumber + " " + streetName
        + "\n\t" + cityName + ", " + stateName + " " + zipCode);

    }
}
