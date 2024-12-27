package Overriding;

public class Airport {
    public void execute(Plane p){
        //TRUE POLY-MORPHISM
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
