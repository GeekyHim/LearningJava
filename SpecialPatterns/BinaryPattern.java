package SpecialPatterns;

import java.util.Scanner;
// to print
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
public class BinaryPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }System.out.println();
        }
        scan.close();
    }

}
