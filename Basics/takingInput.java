package Basics;
import java.util.Scanner;
public class takingInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Radius ");
        double rad = sc.nextDouble();
        double ar = 3.141592 * rad * rad;
        System.out.println("Required Area is "+ar);
        sc.close();
    }
    
}