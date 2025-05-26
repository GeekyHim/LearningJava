class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] charArr1 = new char[128];
        for(int i =0; i<s.length();i++){
          char ch1 = s.charAt(i);
          char ch2 = t.charAt(i);
          int idx = (int) ch1;
          if(charArr1[idx] == '\0') charArr1[idx] = ch2;
          else{
            if(charArr1[idx] != ch2 ) return false;
          }
        }

        // checking other side
        char[] charArr2 = new char[128];
        for(int i =0; i<t.length();i++){
          char ch3 = t.charAt(i);
          char ch4 = s.charAt(i);
          int idx = (int) ch3;
          if(charArr2[idx] == '\0') charArr2[idx] = ch4;
          else{
            if(charArr2[idx] != ch4 ) return false;
          }
        }

        return true;
    }
}