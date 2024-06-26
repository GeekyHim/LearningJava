package CompositePatterns;
import java.util.Scanner;
public class StarBridge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = scan.nextInt();

        for(int i = 1;i<n*2;i++){
            System.out.print("*"+" ");
        }//intial line
        System.out.println();
        int m=n-1;
        for(int i = 1; i<=m;i++){
            for(int j=m; j>=i; j--){
                System.out.print("*"+" ");
            }

            for(int j=1;j<i*2;j++){
                System.out.print(" "+" ");
            }

            for(int j=m; j>=i; j--){
                System.out.print("*"+" ");
            } 
            System.out.println();
            scan.close();
        }
    }
}
