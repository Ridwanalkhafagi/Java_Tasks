package jd_09;

import java.util.Arrays;

public class ClassmatesInitials {

    public static void main(String[] args) {

        String[] names = {"Ridwan AlKhafagi", "Yousif Alkhfagi", "Amir Alkhafagi", "Arij Hussein"};
        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String eachName = names[i];
            String initials1 = eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf(" ") + 1);
            System.out.println(initials1);

        }

    }
}
