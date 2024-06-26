package PatternTriangles;

public class StarTriangleAlt {
    public static void main(String[] args) {
        for(int i = 1; i <=5;i++){
            for (int j = 1; j<=i; j++){ // alt code could be j <i
                System.out.print("* ");
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

