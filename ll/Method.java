// Call With Class

public class Method {
    public void sum() {
        int sum = 89 + 78;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.sum();
    }
}
