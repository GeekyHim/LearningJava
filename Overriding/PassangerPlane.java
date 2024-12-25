package Overriding;

public class PassangerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passanger-Plane Took Off...");
    }

    public void fly(){
        System.out.println("Passanger-Plane is Flying...");
    }

    public void land(){
        System.out.println("Passanger-Plane Landed...");
    }
}
