package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int rt= 2;
        int k = 0;
        while(k<rt){
            int temp = arr[arr.length-1];
            for(int i = 1; i<arr.length ;i++){
            arr[arr.length-i]=arr[arr.length-1-i];
            }
            arr[0]=temp;
            k++;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

}
