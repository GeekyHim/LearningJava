package Basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = scn.next().charAt(0);
        // printing ascii value 
        // typecaste kar do 
        int asci = (int) ch;
        System.out.println(asci);
        scn.close();
        // working :D
    }
    
}
