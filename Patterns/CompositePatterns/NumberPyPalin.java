package CompositePatterns;

import java.util.Scanner;

public class NumberPyPalin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter No of Rows : ");
            int n = scan.nextInt();
            for(int i = 1 ; i<=n ; i++){
                for( int j = 1 ; j<=n-i;j++){
                    System.out.print(" "+" ");
                }
                int j;
                for(j = 1 ; j<=i;j++){
                    System.out.print(j+" ");
                    
                }  
               // int a = j-2; // perhaps? i use kar lu?? IDIOT
                int b = i-1; // row 3 me 3 hai and uske baad 2 pe ana hai 
                // this b is only for trying
                // A is working
                // while(a>=1){
                //     System.out.print(a+" ");
                //     a--;
                // }  
                while(b>=1){ // also for int j=i-1;j>=1;j++
                    System.out.print(b+" ");
                    b--; // also works!
                    // NOTE
                    // Elimninates to have j specially declared and -2; using i is easier.
                }  
                System.out.println();
                scan.close();
            }
    }
}
