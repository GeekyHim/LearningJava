package strings;
import java.util.Scanner;
public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // String s =  (String) n;
       // Cannot cast from int to String
        String s =  "" + n;
        System.out.println(s);
        sc.close();
    }
}
