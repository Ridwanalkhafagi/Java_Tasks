package jd_09;

public class ArrayElements {

    public static void main(String[] args) {

        int[] integers = new int[100];
        int lengthOfArray = integers.length;

        System.out.println("lengthOfArray = " + lengthOfArray);

        for (int i = 0; i < lengthOfArray; i++) {
            integers[i] = i + 1;
            System.out.print(integers[i] + " ");
        }

        System.out.println();

        int[] reveredArray = new int[lengthOfArray];
        for (int i = lengthOfArray - 1, j = 0; i >= 0; i--, j++) {
            reveredArray[j] = integers[i];
            System.out.print(reveredArray[j] + " ");
        }

        System.out.println();

        for (int i = 0; i < lengthOfArray; i++) {
            if(integers[i] % 5 == 0){
                System.out.print(integers[i] + " ");
            }
        }
    }
}
