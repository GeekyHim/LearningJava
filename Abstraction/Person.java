package Abstraction;
abstract class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public  abstract void disp();

}