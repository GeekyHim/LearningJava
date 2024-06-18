package Loops;

import java.util.Scanner;

public class nTermsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Terms : ");
        int n = sc.nextInt();
        System.out.println("Enter starting term : ");
        int a = sc.nextInt();
        System.out.println("Enter Difference term : ");
        int d = sc.nextInt();
        System.out.println(a);
        for( int i = 1 ; i < n ; i++)
        {
            System.out.println(a+=d);
        }
        sc.close();
    }
}
