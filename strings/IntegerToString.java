package strings;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer");
        int n = sc.nextInt();
        System.out.print("Enter Double");
        double d = sc.nextDouble();
        //String s =  "" + n;
        String s = Integer.toString(n);
        System.out.println(s.length());
        System.out.println(Double.toString(d));
        String s2 = Double.toString(d);
        System.out.println(s2.length());
        sc.close();
    }
}
