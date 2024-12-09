package strings;

import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = scn.nextLine();
        int count = 1;
        System.out.println("All Substrings of "+str+":");
        System.out.println("");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
                count++;   
            }
            System.out.println();
        }
        System.out.println("Total Substrings are: "+count);
        scn.close();
    }
}
