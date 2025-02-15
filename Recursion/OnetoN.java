package Recursion;

import java.util.Scanner;

// using global method
public class OnetoN {
    static int n;  // global variable for base case
    public static void printNum(int x){
        if(x>n) return; // base case
        System.out.println(x);
        printNum(x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        printNum(1); // start from one
    }
    
}
