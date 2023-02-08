/* 2- Inheritance
 a) Single Level Inheritance    
base class
    ||
drived class // only one drived class
 */

class Home { // Base Class or Parent Class
    String color;
    String rooms;
    int deposit;
    int rent;

    public void homeInfo() {
    }
}

class FirstTenant extends Home { // Sub Class Or Chield Class
    String name;
    int maintenance;
    String parking;

    public void firstTenant() {
        System.out.println("\n-----|The First Tenant|-----");
        System.out.println("First Tenant Name: " + this.name);
        System.out.println("Interior color: " + this.color);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Maintenance: " + this.maintenance);
        System.out.println("Deposit: " + this.deposit);
        System.out.println("Rent: " + this.rent);
        System.out.println("Parking: " + this.parking);
    }
}

public class InheritanceSingle {
    public static void main(String[] args) {
        FirstTenant ft = new FirstTenant();
        ft.name = "Umar";
        ft.color = "Light-Yellow";
        ft.rooms = "2BHK";
        ft.deposit = 300000;
        ft.rent = 40000;
        ft.parking = "2 Wheeler Only";
        ft.maintenance = 5000;
        ft.homeInfo();
        ft.firstTenant();
    }
}
