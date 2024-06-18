package Basics;

import java.util.Scanner;

public class takingInputs2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Eneter Var");
        double myvar = scn.nextDouble();
        System.out.println(myvar);
        scn.close();
    }
}