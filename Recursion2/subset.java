public class subset {
    public static void printSubset(int index, String str, String ans){
        // WORKS
        if(index == str.length()) {
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(index);
        printSubset(index+1,str,ans+ch);
        printSubset(index+1,str,ans);
        

        // DOESNT WORK
        // if(index == str.length()) {
        //     System.out.println(ans);
        //     return;
        // }
        // printSubset(index+1,str,ans+=str.charAt(index));
        // printSubset(index+1,str,ans);


        // if(index == str.length()) {
        //     System.out.println(ans);
        //     return;
        // }
        // printSubset(index+1,str,ans + str.charAt(index));
        // printSubset(index+1,str,ans);


        // REASON OF WORKING AND NOT WORKING
        // 1st method uses the approach of ans + ch where i m passing a new string taking and not taking the ch 
        // 2nd method ans += char does 2 things
        // first it modifies the existing ans (in essence (obv strings are immutable))
        // second, now the new ans is passed in both calls making so that niche wale me exclude toh hua hi nhi 
        // hence answer was not coming
        // so maybe write ans + str.charAt(index) --> works
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubset(0,str, "");
    }
}
