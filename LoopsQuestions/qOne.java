package LoopsQuestions;

import java.util.Scanner;

public class qOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int digits = 0;
        while(n!=0){ // n>0 negavtive numbers ke liye work nhi karta hai...
            n = n / 10;
            digits++;
        }
        System.out.print("Digits are : " + digits);

        sc.close();
    }
}
