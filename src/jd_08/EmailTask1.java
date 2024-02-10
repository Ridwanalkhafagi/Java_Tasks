package jd_08;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = input.next();

        input.close();

        if(email.contains("_")){
            String pt1 = email.substring(0,email.indexOf("_"));
            String pt2 = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String pt3 = email.substring(email.indexOf("@"));

            System.out.println(pt2 + "_" + pt1 + pt3);
        }else{
            System.out.println(email);
        }


    }
}
