interface Shape {
    double calculateArea();
}

// Implememnting the interface in the circle.
class Circle implements Shape {
    private double radius;

    // constructor for the circle.
    public Circle(double radius) { this.radius = radius; }

    // implementing the abstract method from the shape interface.
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    // constructor for Rectangle.
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() { return length * width; }
}

public class InterfaceAbstraction {
    // Creating instances of Circle and Rectangle.
    Circle myCircle = new Circle(5.0);
    Rectangle myRectangle = new Rectangle(4.0, 6.0);

    // Calculating and printing the areas.
    System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    System.out.println("Area of circle: " + myCircle.calculateArea());
}
