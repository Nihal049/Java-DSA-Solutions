import java.util.Scanner;
// Abstract base class Shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract int calculateArea();
}
// Derived class Square
class Square extends Shape {
    int side;
    Square(int sideLength) {
        side = sideLength;
    }
    // Implementation of calculateArea for Square
    @Override
    public int calculateArea() {
        return side * side;
    }
}
// Derived class Rectangle
class Rectangle extends Shape {
    int length;
    int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    // Implementation of calculateArea for Rectangle
    @Override
    public int calculateArea() {
        return length * width;
    }
}
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareSide, rectangleLength, rectangleWidth;
        squareSide = scanner.nextInt();
        rectangleLength = scanner.nextInt();
        rectangleWidth = scanner.nextInt();
        // Create a Square with a side length
        Square square = new Square(squareSide);
        // Create a Rectangle with length and width
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        // Calculate and display the areas
        System.out.println(square.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}