package Arrays;
public class Sort01Array {
    public static void main(String[] args) {
        int [] nums = {0,1,0,1,0,1,0,1,0,1,1};
        int [] arr = new int[nums.length];
        int key = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[key]=nums[i];
                key++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                arr[key]=nums[i];
                key++;
            }
        }
            nums = arr;
            for(int ele : nums){
                System.out.print(ele+" ");
            }
        }
    }
// alt methods :-
// M1 - Arrays.sort(nums);
// M2 - count 0s and 1s and then make array out of it
    

