package Basics;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number 1 ");
        int n1 = scn.nextInt();

        System.out.print("Enter Number 2 ");
        int n2 = scn.nextInt();

        int sum = n1 + n2;
        System.out.println(sum);
        scn.close();
    }
    
}
