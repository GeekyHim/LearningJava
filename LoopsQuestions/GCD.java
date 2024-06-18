package LoopsQuestions;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 0;
        //GCD or HCF
        for(int i = 1; i<a ; i++){
            if(a%i==0){
                for (int j = 1; j < b; j++) {
                    if(b%j==0){
                        if(i==j){
                            flag = j;
                        }
                    }
                }
            }
        
        }
        System.out.println(flag);
        sc.close();
    }
}
