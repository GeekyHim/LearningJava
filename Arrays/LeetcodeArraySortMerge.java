package Arrays;

public class LeetcodeArraySortMerge {
    public static void main(String[] args) {
        int [] arr = {1,2,3,0,0,0};
        int m = 3, n=3;
        int[] nums = {2,5,6};
        int [] ans = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr[i]<=nums[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }
        if(i<m){
            while(i<m){
            ans[k]=arr[i];
            i++; k++;
            }
        }
        if(j<n){
            while(j<n){
            ans[k]=nums[j];
            j++; k++;
            }
        }
        arr=ans;
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
    
