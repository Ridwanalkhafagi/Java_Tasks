package jd_09;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        System.out.println(Arrays.binarySearch(items, "Gloves"));

        String value = "iPad";
        for (String s: items){
            if(value == s){
                System.out.println("Array has iPad");
            }

        }
        for (int i = 0; i < items.length ; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
    }
}
