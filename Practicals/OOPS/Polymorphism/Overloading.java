package Polymorphism;

public class Overloading {

    public void div(int x, int y) { // two int parameters
        System.out.println(x / y);
    }

    public void div(int a, int b, int c) { // three int parameters
        System.out.println(a / b - c);
    }

    public void div(double p, double q) { // two double parameters
        System.out.println(p * q);
    }

    public static void main(String args[]) {
        Overloading obj = new Overloading();
        obj.div(30, 3);
        obj.div(80, 2, 4);
        obj.div(100, 25);
    }
}
