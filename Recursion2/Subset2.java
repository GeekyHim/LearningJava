
import java.util.ArrayList;

public class Subset2 {
    static ArrayList<String> arrList = new ArrayList<>();
    public static void printSubset(int index, String str, String ans){
        if(index == str.length()) {
            arrList.add(ans);
            return;
        }
        
        char ch = str.charAt(index);
        printSubset(index+1,str,ans+ch);     
        printSubset(index+1,str,ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        arrList = new ArrayList<>(); // reset karne ke liye (especially leetcode etc ke liye)
        printSubset(0,str, "");
        System.out.println(arrList);

    }
}
