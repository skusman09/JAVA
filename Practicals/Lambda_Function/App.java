// Sir's Lecture Code

package Lambda_Function;

@FunctionalInterface
interface MyInterface {
	void p();
}

@FunctionalInterface
interface MyInterface1 {
	void printName(String name);
}

@FunctionalInterface
interface MyInterface2 {
	int sq(int num);
}

@FunctionalInterface
interface MyInter {
	int largest(int a, int b, int c);
}

class Abc implements MyInterface {
	public void p() {
		System.out.println("this is normal interface");
	}

}

class App {
	public static void main(String[] args) {

		// first approach
		MyInterface o = new Abc();
		o.p();

		// second approach
		MyInterface ob1 = new MyInterface() {
			@Override
			public void p() {
				System.out.println("This is second approch with unonames class");

			}
		};
		ob1.p();

		// Third approach -> Lambda Expression
		// rule number1 -> if statement is only one line there is no need to
		// make a block with curly braces{};
		MyInterface ob2 = () -> System.out.println("this is powerful");
		ob2.p();

		MyInterface ob3 = () -> {
			System.out.println("this is first statement");

			System.out.println("this is second statement");
		};
		ob3.p();

		// rule number 2 -> There is no need to specify dataType of argument
		// rule number 3 -> if a single argument is present than there is
		// need to specify round bracket
		MyInterface1 ob4 = name -> System.out.println("Hello " + name);
		ob4.printName("Mahesh Thakur");
		ob4.printName("Rajababu");

		MyInterface2 ob5 = num -> num * num;
		for (int i = 1; i <= 10; i++)
			System.out.println(ob5.sq(i));

		MyInter on6 = (val1, val2, val3) -> {
			if (val1 > val2 && val1 > val3)
				return val1;
			else if (val2 > val1 && val2 > val3)
				return val2;
			else
				return val3;
		};

		System.out.println(on6.largest(10, 23, 87));
	}
}