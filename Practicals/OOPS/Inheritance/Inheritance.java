// Inheritance Example

// Base or Super Class

package Inheritance;

class Employee {
	int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
	int benefits = 10000;
}

// Class Driver
class Inheritance {
	public static void main(String args[]) {
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary
				+ "\nBenefits : " + E1.benefits);
	}

    public class computerscience {
    }
}
