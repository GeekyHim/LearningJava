package Abstraction;

public class Student extends Person {
    int marks;
    String school;

    Student(String name, int age, int marks, String school){
        // method that calls the constructor of parent class.
        super(name, age);
        this.age = age;
        this.school = school;
    }

    public void disp(){
        System.out.println("Name   :"+name);
        System.out.println("Age    :"+age);
        System.out.println("Marks  :"+marks);
        System.out.println("School :"+school);
    }
}
