package PatternTriangles;

public class NumberTriangle {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            for( int j = 1 ; j <= 5; j++){
                System.out.print(j+" ");
                if(i==j) break;
            } System.out.println();
        }
    }
}
