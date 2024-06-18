package PatternPrintingSquares;
import java.util.Scanner;
public class dynamicSqPattern {
        public static void main(String[] args) {
        int rows, cols;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        rows = scan.nextInt();
        System.out.print("Enter Columns : ");
        cols = scan.nextInt();

            for(int i = 1; i <=rows; i++){ // rows
                for(int j = 1; j<=cols;j++){ // columns
                    System.out.print("*");
                }
                System.out.println();
            }
            scan.close();
        }
    }
    


