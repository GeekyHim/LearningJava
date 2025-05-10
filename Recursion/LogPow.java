package Recursion;

// calculating pow(a,b) using log TC

import java.util.Scanner;

public class LogPow {
    public static int LogPow(int base, int pow){ // TC = O(Log (pow))
        if(pow == 0) return 1;
        if(pow == 1) return base;
        int ans = LogPow(base, pow/2);
        if(pow%2==0) return ans*ans; // cozz int division hai, odd number me ek baar skip ho jayega
        else return ans*ans*base;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = scn.nextInt();
        System.out.print("Enter power : ");
        int pow = scn.nextInt();
        System.out.println("Answer is : " + LogPow(base, pow));
        scn.close();
    }
}
