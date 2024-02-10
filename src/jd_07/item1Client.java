package jd_07;

public class item1Client {
    public static void main(String[] args) {


        Item1 item1 = new Item1();

        item1.itemName = "Joe";
        item1.unitPrice = 2.5;
        item1.quantity = 3;

        System.out.println("Item Name = " + item1.itemName);
        System.out.println("Unit Price = " + item1.unitPrice);
        System.out.println("Quantity = " + item1.quantity);

        System.out.println("Total cost = " + item1.calcCost());
        System.out.println(item1.toString());
    }
}