package Arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        System.out.print("Enter Lenght of Array : ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len]; 
        for (int i = 0; i < len ; i++) {
            System.out.print("Enter Array Element " +  (i+1)+ " : ");
            arr[i]=scan.nextInt();
        }
        int ele = arr[0]; // conventionally to store max value, name mx is used. 
        // can also put 
        //Integer.MIN_VALUE;
        
        for (int i = 0; i < len; i++) {
            if(arr[i]>ele){
                ele = arr[i];
                // can also use Math.max(ele,arr[i])
            }
        }
        System.out.print("Max Element : "+ele);
        scan.close();

    }    
}
