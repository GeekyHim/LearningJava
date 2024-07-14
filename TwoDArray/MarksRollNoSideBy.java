package TwoDArray;

import java.util.Scanner;

public class MarksRollNoSideBy {
    public static void main(String[] args) {
        int [] [] marks = new int[4][2];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[0].length;j++){
                System.out.print("Enter Roll No Followed by Marks : ");
                marks[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[0].length;j++){
                System.out.print(marks[i][j]+" ");
            }System.out.println();
        }
        scan.close();
    }
}
