package TwoDArray;
public class Multiplication {
    public static void main(String[] args) {
        int[][] a= {{1,2,1},{2,1,2}}; //new int[2][3];
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};//new int[3][4];
        int[][] c = new int[a.length][b[0].length];
        if(a[0].length!=b.length){
            System.out.println("Matrices Can't be Multiplied");
        }
        else{
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    int ans = 0;
                    for(int k=0;k<a[0].length;k++){
                        ans = a[i][k]*b[k][j] + ans ;    
                    }
                    c[i][j]=ans;
                }
            }
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    System.out.print(c[i][j]+" ");
                }System.out.println();
            }
        }
    }
}
