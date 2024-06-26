package SpecialPatterns;

import java.util.Scanner;

public class NumberTriFlipped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1 ; j<=n ; j++){
                if((i+j)>n) System.out.print((i+j)-n +" ");
                else System.out.print("  ");
            }System.out.println();
        }
        scan.close();
        
    }
}
