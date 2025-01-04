// FAILED ATTEMPT

package StringBuilders;
import java.util.Scanner;

public class ReverseWords {
    public String reversedWord(int start, int last, StringBuilder sb){
        String s = "";
        while(last>=start){ 
            char temp = sb.charAt(last);
            s = s + temp;
            last--;
        }
        return s;
    }
    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Line: ");
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int last = 0;
        String reverdedString = "";
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){ 
                last = i-1;
                reverdedString = reverdedString + obj.reversedWord(start,last,sb)+" " ;
                // why so complicated?
                start = i+1;
            }
        }
        last = sb.length()-1;
        reverdedString = reverdedString + obj.reversedWord(start,last,sb);

        // one solution is to run reverseWord one extra time at end

       
        System.out.println(reverdedString);
    }
}
