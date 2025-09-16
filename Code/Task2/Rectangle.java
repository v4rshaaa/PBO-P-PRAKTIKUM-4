public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // Constructors
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter dan Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Area dan Perimeter
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length +
                ", which is a subclass of " + super.toString();
    }
}
