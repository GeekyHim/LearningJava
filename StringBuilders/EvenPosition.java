package StringBuilders;
import java.util.Scanner;
// change all the even characters to 'a'
public class EvenPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your String");
        String s = scn.nextLine();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0) ans+='a';
            else ans+=s.charAt(i); 
        }
        System.out.println(ans);
    }
}
