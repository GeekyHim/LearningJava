package Overriding;

public class Implemetation {
    public static void main(String[] args) {
        System.out.println("Parent with Parent Class Var Ref");
        Parent myParent = new Parent();
        myParent.inheritence();
        myParent.marry();

        System.out.println();

        System.out.println("Child with Child Class Var Ref");
        Child himanshu = new Child();
        himanshu.inheritence();
        himanshu.marry();
        
        System.out.println();

        System.out.println("Child with Parent Class Var Ref");
        Parent otherParent = new Child();
        otherParent.inheritence();
        otherParent.marry();
        //functions is binded WRT the instace of object created/active rn
    }

}
