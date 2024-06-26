package PatternPrintingSquares;
import java.util.Scanner;
public class alphaTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Pattern Num : ");
        int n = scan.nextInt();

        for( int i = 1; i<=n ; i++){
            for(int j = 1 ; j<=n ; j++)
            System.out.print((char)(i+64)+ " ");
            System.out.println();
        }
        scan.close();
    }


}
