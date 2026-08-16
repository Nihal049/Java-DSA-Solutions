// Define an interface named "Shape"
interface Shape {
    double area();  // Method to calculate the area of a 
        shape
    double perimeter();  // Method to calculate the 
        perimeter of a shape
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {