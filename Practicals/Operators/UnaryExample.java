class UnaryExample {
    public void calcIncrement() {
        int x = 10;
        System.out.println("****Increment****");
        System.out.println(x + " Default Value x");

        System.out.println(x++ + "  x++");
        System.out.println(x++ + "  x++");
        System.out.println(++x + "  ++x");
        System.out.println(x++ + "  x++");

        System.out.println(x + " Default Value x Become " + x);
    }

    public void calcDecrement() {
        int y = 10;
        System.out.println("****Decrement****");
        System.out.println(y + " Default Value y");

        System.out.println(y-- + "  y--");
        System.out.println(y-- + "  y--");
        System.out.println(--y + "  --y");
        System.out.println(y-- + "  y--");

        System.out.println(y + " Default Value y Become " + y);
    }

    public static void main(String args[]) {
        UnaryExample id = new UnaryExample();
        id.calcIncrement();
        id.calcDecrement();
    }
}
