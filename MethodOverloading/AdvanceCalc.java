package MethodOverloading;

public class AdvanceCalc {
    //var-args
    public void add(int... args){
        int sum = 0;
        for (int data : args) {
            sum += data;
        }
        System.out.println(sum);
    }
}
