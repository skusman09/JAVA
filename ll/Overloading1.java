/* concept of polymorphism
1- Method OverLoading(Compile Time Polymorphism)  this method is best
2- Method Overriding(Run Time Polymorphism)  avoid this method


1- ____________|--------Method OverLoading--------|____________
 In same class, all methods are same but operation will be different
"Same Class Same Methods But Different "parameter | dataType(int,float,String,long,boolean) | returnType(void,int)"

if return type is same then you need to take different parameter
else if parameter is same then you need to take different returntype(void, int)
else if all are same then you need to take more number of arguments than previous

****************************It is called compile time polymorphism****************************
 */

class Mobile {
    String brand;
    String display;
    String camera;
    String charging;
    int ram;
    int memory;

    public void mobileInfo(String brand, int ram) { // here it is "string" and "int"
        System.out.println(brand + " 14maxPro " + ram + "GB Ram");
    }

    // i can't take parameter here as "string" and "int" cozz it is throw an error
    public void mobileInfo(int memory, String camera) {
        System.out.println(memory + "GB Internal" + camera);
    }

    // also here i can't take parameter as "int" "String" it is throw an error
    public void mobileInfo(String display, String charging) {
        System.out.println(display + " Display and " + charging);
    }

    // we have to give different
    // parameter | dataType(int,float,String,long,boolean) | returnType(void,int)|

}

public class Overloading1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.mobileInfo("iPhone", 12);
        m1.mobileInfo(512, " 108MP ");
        m1.mobileInfo("OLED", "Wireless Charging");
    }

}