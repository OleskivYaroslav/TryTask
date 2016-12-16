package ua.syavo.oop;

/**
 * Created by Syavo on 14.12.2016.
 */
public class Main {

    public static  void main(String[] args){
        Rectangle rectangle1 = new Rectangle(2, 3, 5, 0);
        Rectangle rectangle2 = new Rectangle(2, 3, 7, 1);
        Circle circle1 = new Circle(0, 0 , 6);
        System.out.println("Circle 1 area = " + circle1.getArea());
        System.out.println("Rectangle 1 area = " + rectangle1.getArea());
        System.out.println("Rectangle 2 area = " + rectangle2.getArea());
        double area = 4;
        System.out.println("area of rectangle1 more then circle1 = " + rectangle1.areaMore(circle1));
        System.out.println("area of rectangle1 more then rectangle2 = " + rectangle1.areaMore(rectangle2));
        System.out.println("area of rectangle1 more then some area = " + rectangle1.areaMore(area));

    }
}
