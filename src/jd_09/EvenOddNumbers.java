package jd_09;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7};
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i : number) {
            if (i % 2 == 0){
                sumOfEven+=1;  //even
            }else{
                sumOfOdd+=1;
            }
        }
        System.out.println("The array has " + sumOfOdd + " odd numbers and " + sumOfEven + " numbers.");
    }
}
