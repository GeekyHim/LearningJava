import java.util.Scanner;
public class GCD{
    
    public static int gcdWithForLoop(int a, int b){
        for(int i = Math.min(a, b);i>=1;i--){
            if(Math.max(a, b)%i==0) return i;
        }
        return 1;
    }

    public static int gcdWithRecurrsion(int num1 , int num2){
        if(num1%num2==0) return num2; // divisor hi hota hai hcf/gcd
        return gcdWithRecurrsion(num2%num1, num1);
        // saying ki remainder and prev divisor 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = scan.nextInt();
        //System.out.println(gcdWithForLoop(num1, num2));
        System.out.println(gcdWithRecurrsion(num1, num2));
    }
}