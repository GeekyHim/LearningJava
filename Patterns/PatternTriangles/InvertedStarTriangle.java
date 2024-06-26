package PatternTriangles;

public class InvertedStarTriangle {
    public static void main(String[] args) {
        for(int i = 5; i >=1;i--){ // also i+j(max)=n+1
            for (int j = 1; j<=5; j++){ // j <= n + 1 - i
                System.out.print("* ");
                if(i==j) break;
                
            }
            System.out.println();
        }
                        // * * * * * 
                        // * * * *   
                        // * * *     
                        // * *
                        // *
    }
}


