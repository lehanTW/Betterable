package bester;

public class Rectangle implements Betterable {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    public boolean isBetter(Rectangle rectangle) {
        return this.area() > rectangle.area();
    }

    @Override
    public boolean isBetter(Betterable other) {
        if (other instanceof Rectangle) {
            return this.area() > ((Rectangle) other).area();
        } else {
            return false;
        }
    }
}
