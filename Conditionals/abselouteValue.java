package Conditionals;

import java.util.Scanner;

public class abselouteValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int n = scn.nextInt();
        if(n>=0) System.out.println(n);
        else System.out.println(-1*n);
        scn.close();
    }
}
//abseloute value mtlb mathematical modulus

