import java.util.ArrayList;

public class ParanthesisME {
    static ArrayList<String> ans = new ArrayList<>();

    public static void makeParan(int n, String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        makeParan(n, s+'(');
        makeParan(n, s+')');
    }


    public static void main(String[] args) {
        makeParan(3,"");
        System.out.println(ans);
    }
}
