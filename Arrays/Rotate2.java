package Arrays;

public class Rotate2 {
public static void main(String[] args) {
    int [] nums = {1,2,3,4,5,6,7};
    int k = 4;
    int n = nums.length;
    int[] arr = new int[n];
    int key = n-k;
    for(int i=0; i<k; i++){
        arr[i]=nums[key+i];
    }
    for(int i = 0;i<key;i++){
        arr[k+i]=nums[i];
    }
    nums=arr;
    for(int x : nums){
        System.out.print(x+" ");
    }
}
}