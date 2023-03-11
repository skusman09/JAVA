class Operator {

    public void Comparison() {
        int a = 15;
        int b = 6;
        System.out.println("******Comparison Operator******");
        System.out.println("a>b: " + (a > b));
        System.out.println("a>=b: " + (a >= b));
        System.out.println("a<b: " + (a < b));
        System.out.println("a<=b: " + (a <= b));
        System.out.println("a==b: " + (a == b));
        System.out.println("a!=b: " + (a != b) + '\n');
    }

    public void Logical() {
        int a = 40;
        int b = 20;
        System.out.println("*******Logical Operator*******");
        System.out.println("a||b: " + ((a > b) || (a < b)));
        System.out.println("a|b: " + ((a > b) | (a > b)));
        System.out.println("a&&b: " + ((a > b) && (a < b)));
        System.out.println("a&b: " + ((a > b) & (a < b)));
    }

    public static void main(String args[]) {
        Operator obj = new Operator();
        obj.Comparison();
        obj.Logical();
    }
}
