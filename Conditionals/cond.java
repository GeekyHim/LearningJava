package Conditionals;

import java.util.Scanner;

public class cond{
    public static void main(String[] args) {
        
    
        // Decision Making
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = scn.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }scn.close();
    }
}