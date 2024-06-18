package SpecialPatterns;
public class Odd {
    // 1
    // 1 3 
    // 1 3 5
    // 1 3 5 7 
    public static void main(String[] args) {
        for( int i = 1; i<=4; i++){
            for(int j = 1;j<=i*2;j++){ // -> executes 8 times
                if (j%2!=0) System.out.print(j+" "); //instead of if use 2*j-1 -> executes 4 times
            }System.out.println();
        }

    }
}
