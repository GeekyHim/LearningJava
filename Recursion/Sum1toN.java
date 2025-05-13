import java.util.Scanner;
public class Sum1toN {

    public static int totalSum(int n){
        if(n == 0) return 0;
        n = n + totalSum(n-1);
        // NewN = LocalN + DecreasedN
        // XYZ = 5 + (5-1)
        // XYZ = 5 + 4 + (4-1)
        // XYZ = 5 + 4 + 3 + 2 + 1 + 0(base case)
        return n;

        // More Compact 
        // return n + totalSum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(totalSum(num));
    }
}
