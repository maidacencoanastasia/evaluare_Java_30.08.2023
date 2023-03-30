public class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
