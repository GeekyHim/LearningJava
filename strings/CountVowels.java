package strings;
import java.util.Scanner;
public class CountVowels {
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='A') return true;
        if(ch=='e'||ch=='E') return true;
        if(ch=='i'||ch=='I') return true;
        if(ch=='o'||ch=='O') return true;
        if(ch=='u'||ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        int vowels = 0;
        String s = scn.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true) vowels++;
            }
        System.out.print("Entered String: "+s+"\nVowels: "+vowels);
        scn.close();
    }
}
