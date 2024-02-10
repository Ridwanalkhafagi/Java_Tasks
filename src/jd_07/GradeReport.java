package jd_07;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score:");

        int score = scanner.nextInt();

        if(score>=90 && score<=100){
            System.out.println("Your grade is an A");
        }else if(score>=80 && score<=90){
            System.out.println("Your grade is a B");
        }else if(score>=70 && score<=80){
            System.out.println("Your grade is a C");
        }else if(score<70 && score>=0){
            System.out.println("You grade is a F");
        }else{
            System.out.println("Invalid Score.");
        }


    }
}
