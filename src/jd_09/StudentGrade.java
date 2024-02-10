package jd_09;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i]>100 || scores[i]<0) {
                System.out.println("invalid input");

                return;
            }
            if(scores[i] >= 90){
                grades[i] = 'A';
            }else if(scores[i] >= 80){
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            }else{
                grades[i] = 'F';
            }

            System.out.println( "grades = " + Arrays.toString(grades));

            for (int j = 0; j < 1; j++) {
                System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
            }

        }


    }
}