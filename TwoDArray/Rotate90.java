package TwoDArray;

// Rotate array by 90 --> Transpose Array + Reverse Each Row

public class Rotate90 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length, n = arr[0].length;
        int [][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // better opton, remove while and use j<i
                    while(i<j) ans[i][j]=arr[j][i];//transpose
            }
        }
        for (int i = 0; i < n; i++) { //row
                int a = 0, b=m-1; // better option name these -> lo and hi
                while(a<b){ //reversing each column
                    int temp = ans[i][a];
                    ans[i][a]=ans[i][b];
                    ans[i][b]=temp;
                    a++;b--;
                }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j]+" ");
            }System.out.println();
        }
        
    }
}
