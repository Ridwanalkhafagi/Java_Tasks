package jd_07;

public class Rectangle {

    public double width;
    public double length;
    public double area;
    public double perimeter;

    public double calculateArea(){
        area = width * length;
        return area;
    }

    public double calculatePerimeter(){
       perimeter=(width*2)+(perimeter*2);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }


}
