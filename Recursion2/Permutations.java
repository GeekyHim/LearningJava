
import java.util.ArrayList;

public class Permutations {

    static ArrayList<String> ansList = new ArrayList<>();
    public static void printPermutations(String ans, String s){
        if(s.length()==0) {
            ansList.add(ans);
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){ // unti calls jitni possibilities --> hence variable calls
            char ch = s.charAt(i);
            String leftString = s.substring(0, i);
            String righString = s.substring(i+1);
            printPermutations(ans+ch, leftString+righString);
        }
        
    }
    public static void main(String[] args) {
        String s = "abc";
        printPermutations("",s);

        System.out.println(ansList);
    }
}
