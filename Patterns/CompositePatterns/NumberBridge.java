package CompositePatterns;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();

        for( int i =1; i<n*2;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print(" "+" ");
            }
            for(int j=n+i;j<n*2;j++){
                
                System.out.print(j+" ");
            }

            System.out.println();
        }
        




        scan.close();
    }
}
