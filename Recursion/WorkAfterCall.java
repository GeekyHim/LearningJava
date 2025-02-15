import java.util.Scanner;

public class WorkAfterCall {

    public static void printNum(int n){
        if(n==0) return;
        printNum(n-1); // call FIRST
        System.out.println(n); // Work SECOND
        // DRY RUN AND SEE wink
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number for N to 1: ");
        int num = scn.nextInt();
        printNum(num);
    }
}
