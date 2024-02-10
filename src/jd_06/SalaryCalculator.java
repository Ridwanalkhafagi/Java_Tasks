package jd_06;

public class SalaryCalculator {

    public static void main(String[] args) {

        double result = salary(45, 40);
        System.out.println(result);
    }

    public static double salary(double hourlyRate, int hours){
        return hourlyRate * hours * 52;
    }

}
