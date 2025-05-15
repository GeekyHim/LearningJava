public class incSeq{
    public static void sequence(int index ,int len, int[] nums, String ans){
        if(len == 0 || index == nums.length) {
            if(len==0) System.out.println(ans);
            
            return ;
        }
        
        sequence( index+1, len, nums, ans); // not take
        
        String s = ""+ nums[index]; // making str
        sequence( index+1, len-1, nums, ans + s); // take 
        // string hai, unmutable, no manual backtracking needed
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int [] num = {1,2,3,4,5,6};
        int len = 4;
        sequence(0, len, num, "");
    }
}