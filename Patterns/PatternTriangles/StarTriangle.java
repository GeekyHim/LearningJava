package PatternTriangles;
public class StarTriangle {
    public static void main(String[] args) {
        for(int i = 1; i <=5;i++){
            for (int j = 1; j<=5; j++){ // alt code? could be j <=i
                System.out.print("* ");
                if(i==j) break;
                
            }
            System.out.println();
        }
    }
}

                                            // * 
                                            // * *
                                            // * * *
                                            // * * * *
                                            // * * * * *