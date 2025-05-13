
import java.util.Scanner;

public class ZigZag {
    public static void pip(int n){
        if( n ==0 ) return;
        System.out.print(n+" ");  // PRE WORK 
        pip(n-1);
        System.out.print(n+" "); // IN WORK 
        pip(n-1);
        System.out.print(n+" "); // POST WORK 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();
        pip(n);
        scn.close();
    }
}
