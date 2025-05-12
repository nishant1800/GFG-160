
public class App {
    public static void main(String args[]) {
        Student s1 = new Student(1, "amit");
        Student s2 = new Student(1, "amit");

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s1.equals(s2));
    }
}

class Student {
    int roll;
    String name;
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}