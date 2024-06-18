package Basics;
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        double y = (double) x ;
        // typecasting kar di yaha pe 
        System.out.println(y);
        scn.close();
    }
    
    // working :D
}
