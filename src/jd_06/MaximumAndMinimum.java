package jd_06;

import java.io.FilterOutputStream;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int maxInt = max(2, 4);
        System.out.println(maxInt);

        double maxDouble = max(2.5, 3.5);
        System.out.println(maxDouble);

        int minInt = min(1,2);
        System.out.println(minInt);

        double minDouble = min(1.5, 3);
        System.out.println(minDouble);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static double min(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }


    }
}
