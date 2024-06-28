package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.print("Enter Lenght of Array : ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++) {
            System.out.print("Enter Array Element " +  (i+1)+ " : ");
            arr[i]=scan.nextInt();
        }

        System.out.print("Enter Element to Search : ");
        int ele = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i < len ; i++) {
            if(ele==arr[i]){
                System.out.print("Element "+ ele + " Found at Index "+i);
                flag = true;
            }
            
        }
        if(flag==false) System.err.print("Element Doesn't Exist in Array..");
        scan.close();
    }
}
