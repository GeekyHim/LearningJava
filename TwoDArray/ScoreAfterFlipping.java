package TwoDArray;

public class ScoreAfterFlipping { //LEETCODE 861
/* 
STEP 1
0th column position pe sab 1 bna do of every row

STEP 2
sare columns check karo?
flip those cols where no of 0 > no of 1


*/

class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for(int i=0;i<m;i++){
          if(arr[i][0]==0){ //flip that row
            for(int j=0;j<n;j++){
              if(arr[i][j]==0) arr[i][j]=1;
              else arr[i][j]=0;
            }
          }
        }
        for(int j=1;j<n;j++){// col 0 is alrdy 1, row col const, row vary
          int noOfZeroes = 0, noOfOnes = 0;
          for(int i=0;i<m;i++){
            if(arr[i][j]==0) noOfZeroes++;
            else noOfOnes++;
          }

          if(noOfZeroes>noOfOnes){
            for(int i=0;i<m;i++){// ab kyuki flip karna hai, col constant, row vary, flip col
              if(arr[i][j]==0) arr[i][j]=1;
              else arr[i][j]=0;
            }
          }
        }
      int score = 0;
      int factor = 1;
      for(int j=n-1;j>=0;j--){
        for(int i=0;i<m;i++){
          score += (arr[i][j]*factor);
        }
        factor *= 2;
      }

      return score;
    }
}
    
}