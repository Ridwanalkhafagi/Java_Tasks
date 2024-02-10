package jd_07;

import java.util.Scanner;

public class PlaceAnOrder {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String productName = scanner.nextLine();

        System.out.println("Enter Price:");
        double price = scanner.nextDouble();

        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        double total = price * quantity;

        System.out.println(firstName + ", your order for " +
                quantity + " " + productName + " has been placed. " +
                "Your total is " + total);

    }
}
