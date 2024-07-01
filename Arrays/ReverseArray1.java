package Arrays;
public class ReverseArray1 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80};
        for(int i = 0; i<=(arr.length-1)/2;i++){
            int temp = arr[i]; //my point is ki dono side se ek ek chiz chali aa rhi hai 
            arr[i]=arr[arr.length-1-i]; // same chiz agar palindrome dekhna hota toh
            arr[arr.length-1-i]=temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
