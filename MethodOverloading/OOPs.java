package MethodOverloading;
public class OOPs {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        AdvanceCalc ac = new AdvanceCalc();

        c.add(10, 20);
        c.add(10, 20,30);
        c.add(10, 20,30,40);
        c.add(10, 20,30,40,50);
        
        System.out.println();
        System.out.println();
        
        //VAR-ARGS
        ac.add();
        ac.add(10);
        ac.add(10, 20);
        ac.add(10, 20,30);
        ac.add(10, 20,30,40);
        ac.add(10, 20,30,40,50);
        
    }
}
