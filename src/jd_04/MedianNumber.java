package jd_04;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 90,
                b = 2,
                c = 1;

        if (b > a && a > c || c > a && a > b) {
            System.out.println(a + " is the median number");
        } else if (a > b && b > c || c > b && b > a) {
            System.out.println(b + " is the median number");
        } else if (b > c && c > a || a > c && c > b) {
            System.out.println(c + " is the median number");
        }else{
            System.out.println("Invalid Input");
        }
    }


    }

