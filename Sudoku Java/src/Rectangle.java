public class Rectangle {
    // Data fields
    private double width = 1;
    private double height = 1;

    // No-arg constructor
    public Rectangle() {
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to get the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to get the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters for width and height
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
