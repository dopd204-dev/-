public class Circle {

    private static final double PI = 3.141592653589793;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double area(double radius) {
        return PI * (radius * radius);
    }

    public static double circumference(double radius) {
        return PI * 2 * radius;
    }
        public static void main(String[] args) {
            Circle circle = new Circle(5);

            System.out.println("Radius: " + circle.getRadius());
            System.out.println("Area: " + Circle.area(circle.getRadius()));
            System.out.println("Circumference: " + Circle.circumference(circle.getRadius()));
        }
    }