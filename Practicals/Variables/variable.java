class variable {
    static int num = 89; // This is static
    long num1 = 1626415; // This is intance

    public void display() {
        char a = 'U'; // local
        double num2 = 9.6;
        System.out.println("local variable value : " + a); // printing local variable
        System.out.println("local variable value : " + num2);
    }

    public void calculate() {
        double num1 = 45.968;
        double num2 = 89.365;
        double result = num1 * num2;
        System.out.println("Calculation is : " + result);
    }

    public static void main(String args[]) {
        variable obj = new variable();
        obj.display();
        obj.calculate();
        System.out.println("Intance variable value : " + obj.num1); // calling intance variable
        System.out.println("Intance variable value : " + num);// calling satatic variable with
    }
}
