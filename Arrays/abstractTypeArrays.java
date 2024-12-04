public class abstractTypeArrays {

    static abstract class Shape {
        abstract void draw();
    }

    static class Circle extends Shape {
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle extends Shape {
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape :  shapes) {
            shape.draw();
        }
    }
}
