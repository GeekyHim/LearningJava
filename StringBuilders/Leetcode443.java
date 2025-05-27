class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int i = 0, j=0;
        while(j<chars.length){
          if(chars[i]==chars[j]) j++;
          else{
            ans += chars[i];
            if(j-i>1) ans += j-i;
            i = j;
          }
        }
        ans += chars[i];
        if(j-i>1) ans += j-i;

        for(int k =0;k<ans.length();k++){
          chars[k] = ans.charAt(k);
        }
      return ans.length();
    }
}