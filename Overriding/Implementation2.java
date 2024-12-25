package Overriding;

public class Implementation2 {
    public static void main(String[] args) {
        Plane p = null;

        p = new PassangerPlane();
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();

        p = new CargoPlane();
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
