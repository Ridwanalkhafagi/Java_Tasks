package jd_06;

public class MathUtility {

    public static void main(String[] args) {

        double result = calculate(9.215, 2, '+');
        System.out.println(result);



    }

    public static double calculate(double a, double b, char c) {
        switch (c) {

            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return a / b;
            }
            default -> {
                return 0;
            }

        }

    }
}




