abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

class Abstraction {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape shape = new Circle();
        shape.draw();
    }
}