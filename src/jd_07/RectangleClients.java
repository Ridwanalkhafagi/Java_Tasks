package jd_07;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 10.0;
        rectangle1.length = 20.0;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle();

        rectangle2.width = 12.34;
        rectangle2.length = 56.78;
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        System.out.println(rectangle2.toString());






    }

}
