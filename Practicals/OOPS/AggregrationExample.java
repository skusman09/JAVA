class Idproof { // class1
	int inum;
	String city;
	String state;
	int pincode;
	String dob;

	Idproof(int inum, String city, String state, int pincode, String dob) {
		this.inum = inum;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.dob = dob;
	}
}

class Student { // class2

	int id;
	String name;
	String emailid;
	long contact;
	Idproof idp; // has a relationship

	Student(int id, String name, String emailid, long contact, Idproof idp) {
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contact = contact;
		this.idp = idp;

	}

	public void show() {
		System.out.println(id + " " + name + " " + emailid + " " + contact);
		System.out.println(idp.inum + " " + idp.city + " " + idp.state + " " + idp.pincode + " " + idp.dob);
	}
}

class AggregrationExample { // main class
	public static void main(String args[]) {
		Idproof i = new Idproof(101, "pune", "Maharashtra", 365254, "26-08-2000");
		Idproof i1 = new Idproof(1022, "Ooty", "Tamil Nado", 236545, "20-03-2001");
		Idproof i2 = new Idproof(10332, "manali", "Himachal Pardesh", 102574, "30-05-1999");

		Student s = new Student(1, "usman", "usman@gmail.com", 773851786, i);
		Student s1 = new Student(2, "umar", "umar@gmail.com", 569825658, i1);
		Student s2 = new Student(3, "maviya", "maviya@gmail.com", 856479256, i2);

		s.show();
		s1.show();
		s2.show();
	}
}