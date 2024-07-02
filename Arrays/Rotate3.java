package Arrays;

public class Rotate3 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;

        int i = 0;
        int j = n-k-1;
        reverse(nums, i, j);

        i=n-k;
        j=n-1;
        reverse(nums, i, j);

        i=0;
        j=n-1;
        reverse(nums, i, j);
        for(int x : nums){
            System.out.print(x+" ");
        }
        

    }

    public static int[] reverse (int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
