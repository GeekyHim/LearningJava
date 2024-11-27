package strings;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello There:");
        String str = sc.next();
        //sc.next only takes one word
        sc.nextLine(); // to consume the /n left by sc.next
        System.out.print("Now enter a sentence:");
        String str2 = sc.nextLine();
        System.out.println(str);
        System.out.println(str2);
        sc.close();
    }
}
