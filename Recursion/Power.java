package Recursion;
import java.util.Scanner;
public class Power {// TC = O(pow)
    public static double powerFunc(double base, int pow){
        if (pow==0) return 1;
        if (pow==1) return base;
        double ans = 0;
        ans = base * powerFunc(base, pow-1);
        return ans;
    } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double base = scn.nextDouble();
        System.out.print("Enter the Power: ");
        int pow = scn.nextInt();
        double ans = powerFunc(base,pow);
        System.out.println(ans);
    }
}
