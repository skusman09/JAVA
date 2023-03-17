// 23/02/2023

package shapes; // Declare Pakage Of Circle Class.

public class Circle { // Main Class.

  static float radius; // Instance Vaiable.
  static float pi; // Instance Vaiable PI.

  public Circle() { // Default Constructor.
    Circle.radius = 1.5f; // Initializing raduis Value As 1.5 As Per Given.
  }

  public Circle(float raduis) { // Parametrized Construcator.
    this(radius, 3.5f); // Initializing pi Value 3.5 As Per Given.
  }

  Circle(float raduis, float pi) { // Constructor With Perimeter.
    // "This" Keyword Pass an argument in the constructor call.
    Circle.pi = pi;
    Circle.radius = raduis;
  }

  double calculateCircleArea(float raduis) { // Method For Calculate Area Of a Circle.
    double result; // Declare Result Variable.
    result = (pi * raduis * raduis); // Formula For Calculating Area Of a Circle.
    return result; // It Will Return The Value(Area) Cozz.. We Use Double DataType.
  }

  double calculateCircumference(float raduis) { // Method For Calculate circumference Of a Circle.
    double result; // defining the result to stor the final circumference value.
    result = (2 * pi * raduis); // Formula For Calculating circumference Of a Circle.
    return result; //  It Will Return The Value(Area) Cozz.. We Use Double DataType.
  }

  public static void main(String args[]) {
    Circle circle = new Circle(10); // Invoking Constructor

    double area = circle.calculateCircleArea(20); // Invoking calculateCircleArea() Method of Circle Class
    System.out.println("Area Of a Circle :" + area); // Displaying Area of Circle

    double circumference = circle.calculateCircumference(30); // Invoking calculateCircumference() Method of Circle Class
    System.out.println("Circumference of Circle :" + circumference); // Displaying Circumference of Circle
  }
}
