
import java.util.Scanner;

public class ReverseEachWord {
    // to reverse a part of sb
    public static void reverse(StringBuilder sb, int start, int end) {
        while(start<=end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end, temp);
            start++; end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int start = 0, end = 0;
        while(end<n){
            if(sb.charAt(end)!=' ') end++;
            else{
                reverse(sb, start, end-1);
                start = end + 1;
                end = start;
            }
        }
        reverse(sb, start, end-1);
        System.out.println(sb);
    }
}
