public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        System.out.println(s1);
        System.out.println(s2);

        // Test Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "yellow", true);
        System.out.println(c1);
        System.out.println("Area: " + c2.getArea() + ", Perimeter: " + c2.getPerimeter());

        // Test Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 4.0, "red", false);
        System.out.println(r1);
        System.out.println("Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());

        // Test Square
        Square sq1 = new Square();
        Square sq2 = new Square(5.0, "purple", true);
        System.out.println(sq1);
        System.out.println(sq2);
        sq2.setSide(10.0);
        System.out.println("Updated Square: " + sq2);
    }
}
