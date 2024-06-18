package SpecialPatterns;

public class Term {
    public static void main(String[] args) {
        for( int i = 1; i<=4; i++){
            int term = 0; //first term 
            for(int j = 1;j<=i;j++){ 
                System.out.print(term+" ");
                term += 5; // AP Common Difference
            }System.out.println();
        }
    }
}
