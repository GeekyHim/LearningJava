package TwoDArray;
public class SpiralArrayTest {
    public static void main(String[] args) {
        int[][] arr = {
            {01, 02, 03, 04},
            {06, 07, 80, 90},
            {11, 12, 13, 14},
            {16, 17, 18, 19},
            {21, 22, 23, 24},
            {26, 27, 28, 29}};
            int m= arr.length, n=arr[0].length;
            int minr=0, minc=0, maxr=m-1, maxc=n-1;
            int looptru=(n/2);
            if(n%2!=0) looptru++;
            while(looptru>0){
                for(int j=minc;j<=maxc;j++){
                    System.out.print(arr[minr][j]+" ");
                }
                minr++;
                for(int i=minr;i<=maxr;i++){
                    System.out.print(arr[i][maxc]+" ");
                }
                maxc--;
                for(int j= maxc; j>=minc;j--){
                    System.out.print(arr[maxr][j]+" ");
                }
                maxr--;
                for(int i= maxr; i>=minr;i--){
                    System.out.print(arr[i][minc]+" ");
                }
                minc++;
                looptru--;

            }
    }
}
