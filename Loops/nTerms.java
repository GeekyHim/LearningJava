package Loops;

import java.util.Scanner;

public class nTerms {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER NO OF TERMS : ");
        int n = scn.nextInt();
        int i = 1;
        for(int m = 1; m<=n ; m++ ){
            
            System.out.println(i);
            i +=2;
        }
        scn.close();
    }
}
