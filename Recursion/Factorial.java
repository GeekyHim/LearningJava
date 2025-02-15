package Recursion;
import java.util.Scanner;
public class Factorial {

    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for factorial: ");
        int num = sc.nextInt();
        System.out.println(fact(num));
        sc.close();
    }
}
