package jd_07;

public class Item1 {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double calcCost(){
        double totalCost = unitPrice * quantity;
        System.out.println(totalCost);
        return totalCost;
    }

    public String toString() {
        return "Item1{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
