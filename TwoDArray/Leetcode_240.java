package TwoDArray;
public class Leetcode_240 {
    class Solution {
        public boolean searchMatrix(int[][] arr, int target) {
            int m = arr.length, n = arr[0].length;
            int i = 0, j = n-1;
            while(i<m  && j>=0){
              if(arr[i][j]==target) return true;
              else if(arr[i][j]>target) j--;  //iske niche vale ke pass jane ki need nhi hai vo sab bde hai, go left
              else i++;
              // means arr[i][j]<target means iske left me chote elements me hi hogs
              // go down :D
            }
            return false;
        }
    }
}
