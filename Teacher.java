public class Teacher extends Person {
    private final String department;

    public Teacher(String name, String department) {
        super(name, 0); // Это супер пупер секретная тайна
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}