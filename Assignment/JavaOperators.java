class JavaOperators {

    /*
     * 1-Arithmetic operator
     * +, -, *, /, %
     */
    public void arithmetic() {
        double a = 30;
        double b = 20;
        System.out.println("*****1-Arithmetic operator*****");
        System.out.println("Addition is: " + (a + b));
        System.out.println("Subtract is: " + (a - b));
        System.out.println("Multiplication is: " + (a * b));
        System.out.println("Division is: " + (a / b));
        System.out.println("Module is: " + (a % b));
    }

    /*
     * 2-Unary operator
     * --, ++
     * 1)post-increment a++ AND a--
     * 2)pre-increment ++a AND --a
     */
    public void unary() {
        int a = 20;
        System.out.println("\n\n***2-Unary operator ++ ***");
        System.out.println("a++ " + a++); // print 20 but throw ==> 21
        System.out.println("a++ " + a++); // 21+1 ==> 22
        System.out.println("++a " + ++a); // 23
        System.out.println("++a " + ++a); // 24
        System.out.println("value of a " + a); // 24
        System.out.println(a++ + a + ++a + a + a++ + a + ++a + ++a); // 24+25+26+26+26+27+28+29
        System.out.println("final value of " + a); // ==>29

        int b = 30;
        System.out.println("\n***2-Unary operator -- ***");
        System.out.println("b-- " + b--); // print 30 but throw ==> 29
        System.out.println("b-- " + b--); // 29-1 ==> 28
        System.out.println("--b " + --b); // 27
        System.out.println("--b " + --b); // 26
        System.out.println("value of b  " + b); // 26
        System.out.println(b-- - --a + b-- + a++ - ++b - a + b - --b + ++a); // 26-28+25+28-25-29+25-24+30
        System.out.println("final value b " + b);
    }

    /*****
     * 3-Assignment operator*****
     * Simple assignment operator: "="
     * Compound assignment operator: +, -, *, /, % is use along with =
     * for e.g. +=, -=, *=, /=, %=
     */
    public void assignment() {
        int a = 80;
        int b = 40;
        System.out.println("\n\n***3-Assignment operator***");
        System.out.println("a += b " + (a += b)); // 120
        System.out.println("a -= b " + (a -= b));// 80
        System.out.println("a *= b " + (a *= b));// 3200
        System.out.println("a /= b " + (a /= b));// 80
        System.out.println("a %= b " + (a %= b));// 0
    }

    /*
     * *****4-Relation Operator OR Comparison operator******
     * ==, !=, >, <, >=, <=,
     */
    public void relation() {
        int a = 70;
        int b = 50;
        System.out.println("\n\n***4-Relation Operator OR Comparison operator***");
        System.out.println("a == b " + (a == b)); // false
        System.out.println("a != b " + (a != b)); // true
        System.out.println("a > b " + (a > b)); // true
        System.out.println("a < b " + (a < b));// false
        System.out.println("a >= b " + (a >= b)); // true
        System.out.println("a <= b " + (a <= b)); // false
    }

    /*****
     * 5-Logical Operator*****
     * && is same to AND,
     * || is same to OR,
     * ! is same as ~
     */
    public void logical() {
        int a = 60;
        int b = 90;
        System.out.println("\n\n******Logical Operator******");
        System.out.println("a < b && a > b   " + (a < b && a > b)); // false
        System.out.println("!(a < b && a > b " + (!(a < b && a > b)));// true
        System.out.println("a < b || a < b   " + (a < b || a < b));// false
        System.out.println("!(a < b || a < b " + (!(a < b || a < b)));// true
    }

    /*
     * *****6-Ternary operator*****
     * "(?:)"
     * Syntax is ==> Variable = Exprsn1 ? Exprsn2(if true) : Exprsn3(else false)
     * this is same as if else if(?) else(:)
     */
    public void ternary() {
        int a = 120;
        int b = 90;
        System.out.println("\n\n*****6-Ternary operator*****");
        System.out.println("a > b ? a : b  " + (a > b ? a : b)); // a==>120
        System.out.println("a < b ? b : a  " + (a < b ? b : a)); // a==>120
        System.out.println("b >= a ? a : b " + (b >= a ? a : b)); // b==>90
        System.out.println("a >= b ? b : a " + (a >= b ? b : a)); // b==>90
    }

    public static void main(String args[]) {
        JavaOperator obj = new JavaOperator();
        obj.arithmetic();
        obj.unary();
        obj.assignment();
        obj.relation();
        obj.logical();
        obj.ternary();
    }
}
