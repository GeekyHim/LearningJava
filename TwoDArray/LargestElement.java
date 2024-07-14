package TwoDArray;
public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{6,7,8},{2,3,7}};
        int mx = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]>mx) mx=arr[i][j];  //math.max(,)   
            }
        }
        System.out.println(mx);
    }
}
