package SpecialPatterns;
import java.util.Scanner;
public class StarPlusOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();
        if(n%2!=0){
            for(int i = 1; i<=n ; i++){
                if(i==(n/2+1)){
                    for(int j = 1; j<=n ; j++){
                        System.out.print("* ");
                    }
                }
                else{
                    for(int k=1; k<=n/2 ;k++)
                    {
                        System.out.print("  ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {System.err.println("Error : Enter Odd Number...");}
        
        scan.close();
    }
}
