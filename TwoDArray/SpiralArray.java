package TwoDArray;
public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = {
            {01, 02, 03, 04, 05},
            {06, 07, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30}};
            int m= arr.length, n=arr[0].length;
            int minr=0, minc=0, maxr=m-1, maxc=n-1;
            int looptru=(n/2);
            if(n%2!=0) looptru++; // because agar toh odd hai toh ek extra cycle chahiye
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
