public class Overloading {

    public int div(int x, int y) { // two int parameters
        return (x / y);
    }

    public int div(int x, int y, int z) { // three int parameters
        return (x / y / z);
    }

    public double div(double x, double y) { // two double parameters
        return (x / y);
    }

    public static void main(String args[]) {
        Overloading s = new Overloading();
        System.out.println(s.div(30, 3));
        System.out.println(s.div(80, 2, 4));
        System.out.println(s.div(100, 25));
    }
}
