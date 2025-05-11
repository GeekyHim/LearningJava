package Recursion;

import java.util.Scanner;
// 1 stair chadi so 1 kam ho gyi and 2 -> 2 
// if we sum all jumps == n
public class Stairs {
    public static int noOfMethods(int n){
        //if (n<= 1) return 1; // yaha socha ja raha tha ki 1 jump kar ke 0 pe aa gya count that, jump kar ke 1 pe aa gya ab 1 more count that  
        // or this also works
        if(n<=2) return n; // yaha keh raha hu 1 se 3 --> 2 ways and 2 se 3 --> 1 way count that  for n = 2 we have 2 ways, upar maine way kar ke count kiya that, yaha bta hi diya
        //if( n == 0 ) return 1;
        //if( n == 1 ) return 1;
        int sum = noOfMethods(n-1) + noOfMethods(n-2);
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total number of Stairs : ");
        int n = scn.nextInt();
        System.out.println("Total ways is : " + noOfMethods(n));
    }
}

// COMPLEXIITY VERY HIGH O(2^N)

