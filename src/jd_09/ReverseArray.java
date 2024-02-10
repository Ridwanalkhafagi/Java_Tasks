package jd_09;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = reverseArray(numbers);

        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
           reversedArray[j]=array[i];
        }

        return reversedArray;
    }
}
