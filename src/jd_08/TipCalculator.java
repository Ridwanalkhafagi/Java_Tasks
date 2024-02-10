package jd_08;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No):");
        String split = input.next();

        System.out.println("Enter the number of people (number):");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount (number):");
        double checkAmount = input.nextDouble();

        System.out.println("How was the Service Quality Excellent/Great/Good/Fair/Poor?");
        String serviceQuality = input.next();

        double totalTip = 0;
        if (serviceQuality.equals("Poor")) {
            totalTip = 0.05 * checkAmount;
        } else if (serviceQuality.equals("Fair")) {
            totalTip = 0.1 * checkAmount;
        } else if (serviceQuality.equals("Good")) {
            totalTip = 0.15 * checkAmount;
        } else if (serviceQuality.equals("Great")) {
            totalTip = 0.2 * checkAmount;
        } else if (serviceQuality.equals("Excellent")) {
            totalTip = 0.25 * checkAmount;
        }else{
            System.out.println("Invalid input");
        }

        double totalToPay = checkAmount + totalTip;
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        if(split.equals("Yes")){
            totalPerPerson = checkAmount/numberOfPeople;
            tipPerPerson = totalTip/numberOfPeople;
        }else{
;
        }

        System.out.println("Number of People entered: " + numberOfPeople);
        System.out.println("Total To Pay = " + totalToPay);
        System.out.println("Total Tip = " + totalTip);
        System.out.println("Total Per Person = " + totalPerPerson);
        System.out.println("Tip per Person = " + tipPerPerson);





    }
}
