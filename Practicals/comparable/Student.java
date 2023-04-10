package comparable;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String name;
	private String course;
	private int fee;

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getFee() {
		return fee;
	}

	public Student(int rollNumber, String name, String course, int fee) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

	@Override
	public int compareTo(Student o) {
		// Integer Sorting

		// if(this.rollNumber > o.getRollNumber())
		// return 1;
		// else if(this.rollNumber<o.getRollNumber())
		// return -1;
		// else
		// return 0;

		// String Sorting
		return this.name.compareTo(o.getName());

	}

}
