import java.util.Scanner;
public class OneToN2 {

    public static void printNum(int num, int flag) {
        if(num>flag) return;
        System.out.println(num);
        printNum(num+1, flag);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        printNum(1, num);
    }    
}
