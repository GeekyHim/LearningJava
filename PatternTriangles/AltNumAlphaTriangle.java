package PatternTriangles;

import java.util.Scanner;

public class AltNumAlphaTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Pattern Lenght : ");
        int n = scan.nextInt();
        for(int i = 1 ; i<=n; i++){
            for( int j = 1; j<=i; j++){
                if(i%2!=0) System.out.print(j + " ");
                else System.out.print((char)(j+64)+ " ");
            }System.out.println();
        }
        scan.close();
    }
    //output
    // 1 
    // A B
    // 1 2 3
    // A B C D
    // 1 2 3 4 5
    // A B C D E F
}
