package Wrapper;

public class Wrapper_Demo {
    public static void main(String[] args) {
        /*
         * These Are The Methods Of Wrapper Class
         * parseInt()
         * toString()
         * toHexString()
         * More Etc.......
         */
        // 01. Integer Wrapper Class
        Integer i = Integer.valueOf("123");
        int j = i.intValue();
        System.out.println(j);

        // 02. Double Wrapper Class
        Double d = Double.valueOf("3.14");
        double pi = d.doubleValue();
        System.out.println(pi);

        // 03. Float Wrapper Class
        Float f = Float.valueOf("95.58");
        float a = f.floatValue();
        System.out.println(a);

        // 04. Long Wrapper Class
        Long l = Long.valueOf("123456789");
        long num = l.longValue();
        System.out.println(num);

        // 05. Character Wrapper Class
        Character c = Character.valueOf('a');
        boolean isLetter = Character.isLetter(c);
        System.out.println(isLetter);

        // Boolean Wrapper Class
        Boolean b = Boolean.valueOf("true");
        boolean k = b.booleanValue();
        System.out.println(k);

    }
}
