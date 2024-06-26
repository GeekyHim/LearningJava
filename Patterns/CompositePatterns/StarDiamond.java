package CompositePatterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();

        for(int i = 1 ; i<=n ; i++){

            for(int j=1; j<=n-i; j++){ //spaces
                System.out.print(" "+" ");
            }
            for(int j=1; j<i*2;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
            for(int i=1;i<=n-1;i++){
                for(int j=1;j<=i;j++){//spaces
                    System.out.print(" "+" ");
                }
                for(int j=1;j<=(n-i)*2-1;j++){
                    System.out.print("*"+" ");
                }
            System.out.println();
        }
    
    scan.close();
    
    }
}
