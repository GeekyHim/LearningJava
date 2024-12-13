package StringBuilders;

import java.util.Scanner;

public class InputStringBuilder {
    public static void main(String[] args) {
        // TECHINICALLY
        // ek string input le ke string builder me daale ge 
        Scanner scn = new Scanner(System.in);

        //METHOD 1
        StringBuilder sb1 = new StringBuilder(scn.nextLine());
        System.out.println(sb1);

        //METHOD 2 
        String s = scn.nextLine();
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);

    }
}
