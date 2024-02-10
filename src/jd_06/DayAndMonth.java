package jd_06;

public class DayAndMonth {

    public static void main(String[] args) {

        String d = day(2);
        System.out.println(d);

        String m = monthName(2);
        System.out.println(m);

        String z = dayInMonth(2);
        System.out.println(z);
    }

    public static String day(int day){
        switch(day){
            case 1 -> {return "Monday";}
            case 2 -> {return "Tuesday";}
            case 3 -> {return "Wednesday";}
            case 4 -> {return "Thursday";}
            case 5 -> {return "Friday";}
            case 6 -> {return "Saturday";}
            case 7-> {return "Sunday";}
            default -> {return "Invalid Number";}
        }
    }

    public static String monthName(int month){
        switch(month){
            case 1 -> {return "January";}
            case 2 -> {return "February";}
            case 3 -> {return "March";}
            case 4 -> {return "April";}
            case 5 -> {return "May";}
            case 6 -> {return "June";}
            case 7-> {return "July";}
            case 8 -> {return "August";}
            case 9 -> {return "September";}
            case 10 -> {return "October";}
            case 11 -> {return "November";}
            case 12-> {return "December";}
            default -> {return "Invalid Number";}
        }
    }

    public static String dayInMonth(int m){
        switch(m){
            case 1,3,5,7,8,10,12 -> {return "31 days";}
            case 2 -> {return "30 days";}
            case 4,6,9,11 -> {return "28 days";}
            default -> {return "Invalid Number";}
        }
    }



}
