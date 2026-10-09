package OOPS.finalKeyword;

public class Circle {

    private double pi = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;

        //can modify the instance variable
        ++pi;
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }
}
