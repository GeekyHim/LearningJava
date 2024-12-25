package Overriding;

public class Airport {
    public void execute(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
