package TwoDArray;

public class WaveformVertical {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * output ->
         * 1 4 7 8 5 2 3 6 9
         */
        
        int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length, n= arr[0].length;
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
