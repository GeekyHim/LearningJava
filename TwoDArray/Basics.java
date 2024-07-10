package TwoDArray;
public class Basics{
    public static void main(String[] args) {
        // Input and output is done with 2 loops
        // nested

        //lenght operator

        int [][] arr = new int[4][5]; // [rows][columns]
        int m = arr.length; // rows
        int n = arr[0].length; // columns
        System.out.println(m+" "+n);


        //PRINTING 2D ARRAY WITH FOR EACH LOOP
        
        for(int[] x : arr ){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
} 