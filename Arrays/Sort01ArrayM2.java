package Arrays;
public class Sort01ArrayM2 {
    public static void main(String[] args) {
        int [] nums = {1,0,0,1,1,1,0,0,1};
        int len = nums.length;
        int i = 0, j= len-1;
        while(i<j){ //<= is wrong
            if(nums[i]==0) i++;
            if(nums[j]==1) j--;
            if(i>j) break; // otherwise sorted array kharanb kar deta hai
            if(nums[j]==0 && nums[i]==1){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j--;
            }
        }
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
