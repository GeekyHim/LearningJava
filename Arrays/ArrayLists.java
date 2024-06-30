package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter the number of Elements You want : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element : ");
            int ele = scan.nextInt();
            al.add(ele);
        }
        System.out.println(al);
        
        scan.close();

    }

}
