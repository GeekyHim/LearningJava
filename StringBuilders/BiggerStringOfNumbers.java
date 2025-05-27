public class BiggerStringOfNumbers {
    
    public static String removeLeadingZeroes(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') return s.substring(i); // bascially uske aage ki sari string
        } // agr sb zero ho toh just return
        return s; 
    }

    public static String maxString(String str1, String str2){
        String strOne = removeLeadingZeroes(str1);
        String strTwo = removeLeadingZeroes(str2);
        if(strOne.length()>strTwo.length()) return str1;
        if(strOne.length()<strTwo.length()) return str2;
        // now means same length
        for(int i=0;i<strOne.length();i++){
            if(strOne.charAt(i)!=strTwo.charAt(i)){
                // same nhi hai so compare kar lo and see which bigger
                // same same nhi hai ya toh str1 bigger hoga a str 2
                if(strOne.charAt(i)>strTwo.charAt(i)) return str1;
                else return str2;
            }
        }
        // in a case both are same string after removing leading zeroes, we check which is bigger in length and return that
        if(str1.length()>str2.length()) return str1;
        else return str2;
        // last condition hi hai ek ki toh length badi hogi 
        // dono ki lenght bhi same hai toh kya phrk pdta return any, such a case else chl jayega yaha ka

    }
    
    public static void main(String[] args) {
        //String [] sArr = {"0002","0023","23","589"};
        String [] sArr = {"000","00"};
        String maxStr = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            maxStr = maxString(maxStr, sArr[i]);
        }
        System.out.println(maxStr);
    }
}
