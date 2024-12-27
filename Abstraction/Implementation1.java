package Abstraction;

public class Implementation1 {
    public static void main(String[] args) {
       // Person p1 = new Person("Himanshu",21);
        // error coz abstract class

        Person p1 = new Student("Himanshu", 21, 100, "GLCS");
        p1.disp();
    }
}
