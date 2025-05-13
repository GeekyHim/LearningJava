package Recursion;
import java.util.Scanner;
public class mazePath {

    public static int mazeSolve(int row, int col){ // my method, also i like this :P
        int sum;
        if(row == 1 || col == 1) return 1;
        sum = mazeSolve(row-1, col) + mazeSolve(row, col-1);
        return sum;
    }
    
    public static int maze(int currRow, int currCol, int endRow, int endCol){
        if(currRow == endRow || currCol == endCol) return 1;
        int rightWays = maze(currRow, currCol + 1, endRow, endCol);
        int downWays = maze(currRow + 1, currCol, endRow, endCol);
        int totalWays = rightWays + downWays;
        return totalWays;
        // same hi likha hai, basically wahi hai bs plus me likha hai 
        // --> sum = maze(currRow, currCol + 1, endRow, endCol) + maze(currRow + 1, currCol, endRow, endCol);
        // sum ---> ek col aage ie row - 1 and ek row aage i.e ek col kam (col -1)
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Eneter M : ");
        int row = scn.nextInt();
        System.out.print("Eneter N : ");
        int col = scn.nextInt();
        
        System.out.println("The number is : "+ mazeSolve(row,col));
        System.out.println("METHOD 2");
        System.out.println("The number is : "+ maze(1,1,row,col));
        // can also write 0,0 se m-1 and n-1 
        scn.close();
    }
}
