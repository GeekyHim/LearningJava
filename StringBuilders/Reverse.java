package StringBuilders;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int last = sb.length()-1;
        int start = 0;
        while(last>start){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(last));
            sb.setCharAt(last, temp);
            last--;
            start++;
        }
        System.out.println(sb);
    }
}
