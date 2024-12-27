package StringBuilders;
import java.util.Scanner;
public class ToggleString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    for(int i=0;i<sb.length();i++){
        char c = sb.charAt(i);
        int ascii = (int) c;
        if(ascii>=97 && ascii<=122) ascii-=32;
        else if(ascii>=65 && ascii<=90) ascii+=32;
        
        sb.setCharAt(i, (char)ascii); 
    }
    System.out.println("Required Toggled String: "+sb);
    sc.close();
    }
}
