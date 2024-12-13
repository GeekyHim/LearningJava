package StringBuilders;

import java.util.Scanner;

public class SetChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("String Builder: "+ sb);
        System.out.print("Enter Position (index) to replace: ");
        int pos = scan.nextInt();
        System.out.print("Enter Desired Character: ");
        char ch = scan.next().charAt(0);

        sb.setCharAt(pos, ch);
        System.out.println(sb);
        //setCharAt(Index, Character)
        scan.close();

    }
}
