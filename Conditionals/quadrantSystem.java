package Conditionals;
import java.util.Scanner;
public class quadrantSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter X Quadinates : ");
        double x = scn.nextDouble();
        System.out.print("Enter Y Quadinates : ");
        double y = scn.nextDouble();

        if(x>0 && y>0) System.out.println("1st Quadrant");
        else if(x<0 && y>0) System.out.println("2nd Quadrant");
        else if(x<0 && y<0) System.out.println("3rd Quadrant");
        else if(x>0 && y<0) System.out.println("4th Quadrant");
        else if(x != 0 && y == 0) System.out.println("On X-Axis");
        else if(x==0 && y!=0) System.out.println("On Y-Axis");
        else System.out.println("Origin");


        scn.close();
        // working :D
    }
}
