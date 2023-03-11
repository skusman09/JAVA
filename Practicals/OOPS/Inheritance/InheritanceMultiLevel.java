/* 2- Inheritance
 a) Multi Level Inheritance    
base class        a
    ||
drived class   b -> a
    ||         
drived class   c  -> a // more than one drived class   
 */

class Grandpa { // class 1
    String name;
    String marriageDate;
    String hairColor;
    String eyeColor;
    double height;
    int age;
    int kids;

    public void grandpa() {
        System.out.println("Im GrandFather");
        System.out.println("MarriageDate: " + this.marriageDate);
        System.out.println("HairColor: " + this.hairColor);
        System.out.println("EyeColor: " + this.eyeColor);
        System.out.println("Height: " + this.height);
        System.out.println("Ege: " + this.age);
        System.out.println("Kids: " + this.kids);
    }
}

class Father extends Grandpa { // class 2 extends class 1
    public void father() {
        System.out.println("\nIm Father");
        System.out.println("MarriageDate: " + this.marriageDate);
        System.out.println("HairColor: " + this.hairColor);
        System.out.println("EyeColor: " + this.eyeColor);
        System.out.println("Height: " + this.height);
        System.out.println("Ege: " + this.age);
        System.out.println("Kids: " + this.kids);
    }

}

class Son extends Father { // class 3 extends class 1
    public void son() {
        System.out.println("\nIm Son");
        System.out.println("Age: " + this.age);
        System.out.println("Hair Color: " + this.hairColor);
        System.out.println("Eye Color: " + this.eyeColor);
        System.out.println("Height: " + this.height);
    }

}

public class InheritanceMultiLevel {
    public static void main(String[] args) {
        Grandpa grandpa = new Grandpa();
        grandpa.marriageDate = "10-02-1940";
        grandpa.hairColor = "white";
        grandpa.eyeColor = "Brown";
        grandpa.age = 70;
        grandpa.height = 6.1;
        grandpa.kids = 3;
        grandpa.grandpa();

        Father father = new Father();
        father.marriageDate = "28-06-1980";
        father.age = 40;
        father.eyeColor = "blue";
        father.kids = grandpa.kids;
        father.height = 5.9;
        father.hairColor = "Black";
        father.father();

        Son son = new Son();
        son.age = 15;
        son.eyeColor = grandpa.eyeColor;
        son.height = father.height;
        son.hairColor = father.hairColor;
        son.son();
    }
}