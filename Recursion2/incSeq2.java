import java.util.ArrayList;

public class incSeq2{
    static ArrayList<ArrayList<Integer>> fList = new ArrayList<>() ;
    public static void sequence(int index ,int len, int[] nums, ArrayList<Integer> ans){
        if(len == 0 || index == nums.length) {
           
            if(len==0) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i =0;i<ans.size();i++){
                    list.add(ans.get(i));
                }
                fList.add(list);
            }
            return ;
        }
        
        sequence( index+1, len, nums, ans); // not take
        
        ans.add(nums[index]); // for take
        sequence( index+1, len-1, nums, ans); // take 
        ans.remove(ans.size()-1); // backtracking
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        int [] num = {1,2,3,4,5,6};
        int len = 4;
        sequence(0, len, num, ans);
        System.out.println(fList);
    }
}