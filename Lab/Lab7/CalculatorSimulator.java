/* LAB 07 --> 17-03-23
Problem Statement 1:
Develop a simple java application to calculate the tax for a particular employee based on his salary.
 */

// Custom Exceptions Wich Is User Define

// This is Class for "CountryNotValidException" Wich extends Exception
class CountryNotValidException extends Exception {
    public String getMessage() {
        // Creating "getMessage()" Method For Using When We Throw an Error
        // And String which describes the error message when an
        // "CountryNotValidException" is thrown.
        return "The employee should be an Indian citizen for calculating tax.";
    }
}

// This is Class for "EmployeeNameInvalidException" Wich extends Exception
class EmployeeNameInvalidException extends Exception {
    // Creating "getMessage()" Method For Using When We Throw an Exception
    // And String which describes the error message when an
    // "EmployeeNameInvalidException" is thrown.
    public String getMessage() {
        return "The employee name cannot be empty";
    }
}

// This is Class for "TaxNotEligibleException" Wich extends Exception
class TaxNotEligibleException extends Exception {
    // Creating "getMessage()" Method For Using When We Throw an Error
    // And String which describes the error message when an
    // "TaxNotEligibleException" is thrown.
    public String getMessage() {
        return "The employee does not need to pay tax";
    }
}

// Create a Class TaxCalculator with a method named calculateTax
class TaxCalculator {

    // Creating "calculateTax()" Method with parameter (empName, isIndian, empSal)
    // And Return double taxAmount
    // Also Method Throws three custom Exception "CountryNotValidException",
    // "EmployeeNameInvalidException", "TaxNotEligibleException"
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        // This line checks if "isIndian" is "false" using a logical "NOT" operator "!".
        // If isIndian is false, which means the employee is not Indian
        if (!isIndian)

            // This line throws a custom exception "CountryNotValidException" using the
            // "throw" keyword.
            throw new CountryNotValidException();

        // This line checks "empName" is "Null" or "Empty" using "==" and "isEmpty"
        // "isEmpty" Is a "String Class".
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException();
        }

        double taxAmount; // Declare a Variable "taxAmount"
        // Checks if "empSal" is greater than "100000" and if "isIndian" is true.
        // If this Condition is true, then the tax amount is calculated
        // as "empSal*8/100" and returned.
        if (empSal > 100000 && isIndian == true) {
            return taxAmount = empSal * 8 / 100;

            // Checks If "empSal" is between 50K and 1lakh and "isIndian" is true.
            // If this Condition is true, then the tax amount is calculated
            // as "empSal*6/100" and returned.
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian == true) {
            return taxAmount = empSal * 6 / 100;

            // Checks If "empSal" is between 30K and 50k and "isIndian" is true.
            // If this Condition is true, then the tax amount is calculated
            // as "empSal*5/100" and returned.
        } else if (empSal >= 30000 && empSal <= 50000 && isIndian == true) {
            return taxAmount = empSal * 5 / 100;

            // Checks If "empSal" is between 10K and 30k and "isIndian" is true.
            // If this Condition is true, then the tax amount is calculated
            // as "empSal*4/100" and returned.
        } else if (empSal >= 10000 && empSal <= 30000 && isIndian == true) {
            return taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException();
        }
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(); // Object Creation
        // "try" This keyword indicates the beginning of the block of code to be tested
        // for exceptions.
        // Test Case 01:
        try {
            System.out.println("\nTest Case 01: ");

            // Calling the "calculateTax" method of the "calculator" object and
            // Passing three arguments to it: empName="Ron", isIndian=false ,empSal=34000
            double taxAmount = calculator.calculateTax("Ron", false, 34000);

            // This line prints the resulting tax amount for the given test case 01.
            System.out.println("Tax amount is " + taxAmount);

            // "Catch" This block of code is executed if an "exception" occurs during the
            // execution of the "try" block.
        } catch (Exception e) {
            // Invoking "getMessage()" method and it will print "Message"
            System.out.println(e.getMessage());
        }

        // Test Case 02:
        try {
            System.out.println("\nTest Case 02: ");

            // Calling the "calculateTax" method of the "calculator" object and
            // Passing three arguments to it: empName="Tim", isIndian=true ,empSal=1000
            double taxAmount = calculator.calculateTax("Tim", true, 1000);

            // This line prints the resulting tax amount for the given test case 02.
            System.out.println("Tax Amount Is: " + taxAmount);

            // "Catch" This block of code is executed if an "exception" occurs during the
            // execution of the "try" block.
        } catch (Exception e) {
            // Invoking "getMessage()" method and it will print "Message"
            System.out.println(e.getMessage());
        }

        // Test Case 03:
        try {
            System.out.println("\nTest Case 03: ");

            // Calling the "calculateTax" method of the "calculator" object and
            // Passing three arguments to it: empName="Jack", isIndian=true ,empSal=55000
            double taxAmount = calculator.calculateTax("Jack", true, 55000);

            // This line prints the resulting tax amount for the given test case 03.
            System.out.println("Tax Amount Is: " + taxAmount);

            // "Catch" This block of code is executed if an "exception" occurs during the
            // execution of the "try" block.
        } catch (Exception e) {
            // Invoking "getMessage()" method and it will print "Message"
            System.out.println(e.getMessage());
        }

        // Test Case 04:
        try {
            System.out.println("\nTest Case 04: ");

            // Calling the "calculateTax" method of the "calculator" object and
            // Passing three arguments to it: empName="Alice", isIndian=true ,empSal=30000
            double taxAmount = calculator.calculateTax("Alice", true, 30000);

            // This line prints the resulting tax amount for the given test case.
            System.out.println("Tax Amount Is: " + taxAmount);

            // "Catch" This block of code is executed if an "exception" occurs during the
            // execution of the "try" block.
        } catch (Exception e) {
            // Invoking "getMessage()" method and it will print "Message"
            System.out.println(e.getMessage());
        }

    }
}