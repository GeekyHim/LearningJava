package SpecialPatterns;

import java.util.Scanner;

public class TRI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.print("Enter No of Rows : ");
            int n = scan.nextInt();

            for(int i = 1 ; i<=n;i++){
                for(int j = 1 ;j<=(n-i+1)*2-1;j++ ){
                    System.out.print("*"+" ");
                }System.out.println();
            }
            scan.close();
    }
}
