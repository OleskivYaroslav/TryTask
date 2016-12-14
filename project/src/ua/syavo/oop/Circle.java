package ua.syavo.oop;

/**
 * Created by Syavo on 15.12.2016.
 */
public class Circle implements Figure {

    private double x1;
    private double y1;
    private double R;

    void Circle(){
        this.x1 = 0;
        this.y1 = 0;
        this.R = 1;
    }

    void Circle(double x1, double y1, double R){
        this.x1 = x1;
        this.y1 = y1;
        this.R = R;
    }

    public double getArea() {
        return Math.PI*R*R;
    }

    public double getPerimeter() {
        return 2*Math.PI*R;
    }

    public boolean areaMore() {
        return false;
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

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getR() {
        return R;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setR(double r) {
        R = r;
    }
}
