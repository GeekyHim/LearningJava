package Conditionals;
import java.util.Scanner;

public class least {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        if(n1<=n2 && n1<=n3)
        {
            System.out.println(n1);
        }else if(n2<=n1 && n2<=n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
        scn.close();
    }
}
