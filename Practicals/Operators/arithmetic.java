class arithmetic {
    public void calc() {
        int a = 30;
        int b = 20;
        System.out.println("Addition is: " + (a + b));
        System.out.println("Subtraction is: " + (a - b));
        System.out.println("Multiplication is: " + (a * b));
        System.out.println("Division is: " + (a / b));
        System.out.println("Module is: " + (a % b));
    }

    public static void main(String args[]) {
        arithmetic add = new arithmetic();
        add.calc();
    }
}
