package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = scn.nextInt();
        System.out.print("Enter Sell Price : ");
        int sp = scn.nextInt();
        scn.close();
        if(sp>cp){
            System.out.println("PROFIT");
            int p = sp-cp;
            System.out.println("PROFIT = "+ p);
        } else if(sp==cp) {
            System.out.println("NO PROFIT NO LOSS");
        } else {
            System.out.println("LOSS");
            int l = cp-sp;
            System.out.println("LOSS = " + l );
        }
    }
}
