package TwoDArray;
public class spiral2 {
    public static void main(String[] args) {
        int n = 5;
        int num=0;
        int[][] arr = new int[n][n];
        int minr=0, minc=0, maxr=n-1, maxc=n-1;
        while(minr<=maxr && minc<= maxc){
            for(int j=minc;j<=maxc;j++){
                arr[minr][j]= num++ ;
            }
            minr++;
            if(minr>maxr || minc > maxc) break;
            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=num++; 
            }
            maxc--;
            if(minr>maxr || minc > maxc) break;
            for(int j= maxc; j>=minc;j--){
                arr[maxr][j]=num++;
            }
            maxr--;
            if(minr>maxr || minc > maxc) break;
            for(int i= maxr; i>=minr;i--){
                arr[i][minc]=num++;
            }
            minc++;
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
            System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
