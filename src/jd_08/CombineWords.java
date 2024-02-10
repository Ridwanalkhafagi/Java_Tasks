package jd_08;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.next();
        System.out.println("Enter second word: ");
        String secondWord = input.next();

       if(firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){

           secondWord = secondWord.substring(1);

           System.out.println(firstWord + secondWord);

       }else{

           String combineWords = firstWord.concat(secondWord);
           System.out.println(combineWords);

       }


    }
}