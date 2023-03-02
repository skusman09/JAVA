class Car {

  int speed;
  String brand;
  int price;

  public Car(int speed, String brand, int price) {
    this.speed = speed;
    this.brand = brand;
    this.price = price;
  }

  @Override
  public String toString() { // We Use toString Method To Print Object
    return "Speed " + speed + "\nBrand " + brand + "\nPrice " + price;
  }
}

public class ToString_method {

  public static void main(String[] args) {
    Car car1 = new Car(300, "BMW", 400000);
    System.out.println(car1); // We Can't Print Object Directly, But If We Use toString Method It Can Be Print
  }
}
