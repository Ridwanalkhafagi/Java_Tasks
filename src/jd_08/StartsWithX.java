package jd_08;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next();

        String newWord = replaceX(word);
        System.out.println("New word is: " + newWord);

        input.close();
    }
        public static String replaceX(String word) {
            if (word.startsWith("x")) {
                return "a" + word.substring(1);

            }else{
                return word;
            }
        }

    }
