package PatternTriangles;

public class AlphaTriagles {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){ 
            for( int j = 1 ; j <= 5; j++){
                System.out.print((char)(j+64)+" ");// typecasting using ascii values. 
                if(i==j) break;
            } System.out.println();
        }
    }
}
