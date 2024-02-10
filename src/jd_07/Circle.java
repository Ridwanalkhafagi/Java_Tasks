package jd_07;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius:");

        double radius = scanner.nextDouble();

        double area = radius * radius * 3.14;
        double perimeter = radius * 2 * 3.14;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
