package jd_07;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the miles:");

        double mile = scanner.nextDouble();

        double kmEquation = mile * 1.609;

        System.out.println(mile + " miles is equal to " +
                kmEquation + " kilometers");

    }
}
