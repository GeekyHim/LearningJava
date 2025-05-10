package Recursion;

import java.util.Scanner;

public class Fibbo {
    public static int fib(int num){
        if(num<=1) return num;
        int ans = fib(num-1) + fib(num-2);
        return ans;
    }
// finding the nth fibbonacci number using recurrsion
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Eneter The Number of place whose value u want : ");
        int num = scn.nextInt();
        System.out.println("The number is : "+ fib(num));
        scn.close();
    }
}
