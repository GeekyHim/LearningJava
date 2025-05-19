import java.util.ArrayList;
import java.util.Scanner;

public class paran3 {
    static ArrayList<String> ans = new ArrayList<>();

    public static void print(int open, int close, int n, String s){
        if(s.length()==n*2) {
            ans.add(s);
            return;
        }
        if(open>=n) print(open,close+1,n,s+')');
        else if(close==open) print(open+1,close,n,s+'(');
        else{
            print(open+1,close,n,s+'(');
            print(open,close+1,n,s+')');
        }
    }


    // smaller version

    public static void smallerCode(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }

        if(open<n) smallerCode(open+1, close, n, s+'(');
        if(close<open) smallerCode(open, close+1, n, s+')');
        // kyuki ye if hai not else if, dono conditions will run 
        // maine phele else if use kiya tha becoz of which only
        // 1 of the 2 ran and recursive tree properly nhi bn raha tha and only
        // one possible outcome aa raha tha 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of pair of brackets u want: ");
        int n = scn.nextInt();
        print(0,0,n,"");
        System.out.println(ans);
    }
}

