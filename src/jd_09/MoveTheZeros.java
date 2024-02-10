package jd_09;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array1 = {10, 0, 5, 0, 1, 0};
        int[] array2 = new int[array1.length];

        int j = 0;

        for (int i = 0; i < array1.length; i++) {
            if(array1[i]!= 0){
                array2[j++] = array1[i];
            }
        }

        System.out.println(Arrays.toString(array2));

    }
}
