package Overriding;

public class Implementation3 {
    public static void main(String[] args) {
        Airport a = new Airport();
        CargoPlane c = new CargoPlane();
        a.execute(c);

        PassangerPlane p = new PassangerPlane();
        a.execute(p);
        //TRUE POLYMOTPHISM 
        // ek hi method me different argument dene se different kaam
        // ek hi method behaves in different ways
    }
}
