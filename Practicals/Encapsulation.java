class Student {
    private int sid;
    private String name;
    private String email;
    private long phone;

    public int getSid() {
        return sid;
    }

    public void setSid(final int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(final long phone) {
        this.phone = phone;
    }

}

public class Encapsulation {
    public static void main(final String[] args) {
        Student std = new Student();
        std.setSid(15);
        std.setName("Usman");
        std.setEmail("imusman46@gmail.com");
        std.setPhone(7738517868L);

        System.out.println("Student Details: ");
        System.out.println("Student ID " + std.getSid());
        System.out.println("Student Name " + std.getName());
        System.out.println("Student Email " + std.getEmail());
        System.out.println("Student Phone " + std.getPhone());
    }
}