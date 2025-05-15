import java.util.ArrayList;
import java.util.List;

public class Subset3 {
    static List<List<Integer>> arr;

    public void helperFunction(int index, int[] nums, ArrayList<Integer> ans) {
        if(index==nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<ans.size();i++){
                list.add(ans.get(i));
            }
            arr.add(list);
            return;
        }
        helperFunction(index+1,nums,ans); // not take 
        ans.add(nums[index]);
        helperFunction(index+1,nums,ans); // take
        ans.remove(ans.size() - 1);

    }
    public List<List<Integer>> subsets(int[] nums) {
         arr = new ArrayList<>();
         ArrayList<Integer> ans = new ArrayList<>();
         helperFunction(0,nums,ans);
         return arr;
         
    }
}

