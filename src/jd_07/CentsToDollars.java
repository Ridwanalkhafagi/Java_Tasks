package jd_07;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cents:");

        int cents = scanner.nextInt();

        int remainder = cents % 100;
        int dollars = (cents - remainder)/100;
        System.out.println(cents + " cents is equal to " + dollars + " dollars and "
        + remainder + " cents");


    }
}
