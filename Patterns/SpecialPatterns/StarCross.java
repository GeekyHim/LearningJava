package SpecialPatterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n; j++){
                if(i==j) System.out.print("*"+" ");
                else if(i+j==n+1) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }System.out.println();
        }
        scan.close();
    }
}
