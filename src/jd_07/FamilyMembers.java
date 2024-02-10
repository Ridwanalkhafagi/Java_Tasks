package jd_07;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int number = scanner.nextInt();

        if(number<3 && number>=0){
            System.out.println("Live with less than 3 people.");
        }else if(number>=3 && number<=6){
            System.out.println("Live with 3 - 6 people.");
        }else if(number>6){
            System.out.println("Live with more than six people.");
        }else{
            System.out.println("Invalid Input");
        }

    }
}
