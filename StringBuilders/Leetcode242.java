
import java.util.Arrays;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // agar len hi same nhi hai means diff hai and can never be anagrams :p
        char[] input1 = s.toCharArray();
        char[] input2 = t.toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        for(int i=0; i<s.length();i++){
          if(input1[i]!=input2[i]) return false;
        }
        return true;
    }
}

