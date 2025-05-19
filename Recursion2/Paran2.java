import java.util.ArrayList;

public class Paran2 {
    static ArrayList<String> ans = new ArrayList<>();

    public static void makeParan(int n, String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)=='('){
            makeParan(n, s+'(');
            makeParan(n, s+')');
        }
        else    makeParan(n, s+')');    
    }


    public static void main(String[] args) {
        makeParan(6,"");
        System.out.println(ans);
    }
}
