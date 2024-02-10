package jd_08;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.next();

        System.out.println("Enter second word:");
        String secondWord = input.next();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));



    }
}