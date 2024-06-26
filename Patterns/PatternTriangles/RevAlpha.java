package PatternTriangles;

public class RevAlpha {
    public static void main(String[] args) {
        for(int i = 1;i <=5;i++){
            for( int j = 1; j<= 5+1-i;j++){// 5 + 1 - i--> n + 1 - i
                System.out.print((char)(i+64)+" ");
            }System.out.println();
        }
    }
}
