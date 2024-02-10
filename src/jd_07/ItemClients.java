package jd_07;

public class ItemClients {

    public static void main(String[] args) {


        Item item1 = new Item();

        item1.itemName = "Takis";
        item1.unitPrice = 2.99;
        item1.quantity = 2;

        item1.calcCost();

        System.out.println(item1.toString());

        Item item2 = new Item();

        item2.itemName = "Cheetos";
        item2.unitPrice = 3.20;
        item2.quantity = 4;

        item2.calcCost();
        System.out.println(item2.toString());
    }
}