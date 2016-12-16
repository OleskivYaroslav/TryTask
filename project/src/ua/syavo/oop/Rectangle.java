package ua.syavo.oop;

/**
 * Created by Syavo on 15.12.2016.
 */
public class Rectangle implements Figure{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

    public Rectangle(){
        this.x1 = 0;
        this.y1 = 1;
        this.x2 = 1;
        this.y2 = 1;
        this.x3 = 1;
        this.y3 = 0;
        this.x4 = 0;
        this.y4 = 0;
    }

    public Rectangle(double x1, double y1, double x3, double y3){
        this.x1 = x1;
        this.x4 = x1;
        this.y1 = y1;
        this.y2 = y1;
        this.x3 = x3;
        this.x2 = x3;
        this.y3 = y3;
        this.y4 = y3;
    }



    public double getArea() {
        return Math.abs(x1-x2)*Math.abs(y1-y4);
    }

    public double getPerimeter() {
        return 2 * (Math.abs(x1-x2) + Math.abs(y1-y4));
    }


    public boolean areaMore(double area) {
        boolean bool = false;
        if(area< this.getArea()){
            bool = true;
        }
        return  bool;
    }

    public boolean areaMore(Circle circle) {
        boolean bool = false;
        if(circle.getArea()< this.getArea()){
            bool = true;
        }
        return  bool;
    }

    public boolean areaMore(Rectangle rectangle) {
        boolean bool = false;
        if(rectangle.getArea()< this.getArea()){
            bool = true;
        }
        return  bool;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double getX4() {
        return x4;
    }

    public double getY4() {
        return y4;
    }


}

