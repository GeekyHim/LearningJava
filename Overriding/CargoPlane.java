package Overriding;

public class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo-Plane Took Off...");
    }

    public void fly(){
        System.out.println("Cargo-Plane is Flying...");
    }

    public void land(){
        System.out.println("Cargo-Plane Landed...");
    }
    
}
