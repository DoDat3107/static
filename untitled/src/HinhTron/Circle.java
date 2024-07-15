package HinhTron;

public class Circle {
    private double radius;
    private int id;
    public static int nextId = 1;
    public static double maxRadius = 0;
    public static double sumS = 0;

    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.id = nextId++;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        sumS = sumS + S();
    }

    public double V() {
        return 2 * PI * radius;
    }
    public double S() {
        return  PI * radius *radius;
    }


    public double getRadius() {
        return radius;
    }


    public int getId() {
        return id;
    }


    public double getPI() {
        return PI;
    }

    public static double MaxRadius() {
        return maxRadius;
    }
    public static double SumS() {
        return sumS;
    }


}
