import java.util.Scanner;

public class SumOnetoN {

    public static void sum1toN(int n, int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        sum1toN(n-1, sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;
        sum1toN(num,sum);
    }
}
