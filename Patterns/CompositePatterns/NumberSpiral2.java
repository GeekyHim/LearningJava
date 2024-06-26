package CompositePatterns;

import java.util.Scanner;

public class NumberSpiral2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter No of Rows : ");
            int n = scan.nextInt();

            for(int i = 1;i<=n*2-1;i++){
                for(int j=1;j<=n*2-1;j++){
                    int a = i, b =j;
                    if(i>n) a = 2*n-i;
                    if(b>n) b = 2*n-j;
                    System.out.print(Math.min(a,b)+" ");
                    
                }
                System.out.println();
                scan.close();
            }
    }
}