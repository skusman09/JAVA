import java.util.Scanner;

class Itteration {
    public void ForLoop(int num1) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Your Table Is: " + num1 + "x" + i + " = " + (num1 * i));
        }
    }
    
    public void WhileLoop(int num2) {
        int j = 1;
        while (j <= 10) {
            System.out.println("Your Table Is: " + num2 + "x" + j + " = " + (num2 * j));
            j++;
        }
    }
    
    public void DoWhileLoop(int num3) {
        int k = 1;
        do {
            System.out.println("Your Table Is: " + num3 + "x" + k + " = " + (num3 * k));
            k++;
        } while (k <= 10);
        
    }
    
    public static void main(String argd[]) {
        Itteration obj = new Itteration();
        Scanner sc = new Scanner(System.in);
        

        System.out.println("----------FOR LOOP------------");
        System.out.println("Enter Number For Table: ");
        int num1 = sc.nextInt();
        obj.ForLoop(num1);
        
        
        System.out.println("\n\n----------WHILE LOOP------------");
        System.out.println("Enter Number For Table: ");
        int num2 = sc.nextInt();
        obj.WhileLoop(num2);
        
        
        System.out.println("\n\n----------DO LOOP------------");
        System.out.println("Enter Number For Table: ");
        int num3 = sc.nextInt();
        obj.DoWhileLoop(num3);
        
    }
}
