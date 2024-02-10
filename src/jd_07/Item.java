package jd_07;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double totalCost;

    public double calcCost() {
        totalCost=unitPrice * quantity;
        System.out.println("totalCost = " + totalCost);
        return totalCost;
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}
