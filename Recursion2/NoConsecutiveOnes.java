public class NoConsecutiveOnes{

    public static void method2(String s, int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }

        if(m==0 || s.charAt(m-1)=='0'){
            method2(s+'1', n);
            method2(s+'0', n);
        } else{
            method2(s+'0', n);
        }
    }
    public static void makeString(int len, String ans){
        if(0 == len){
            System.out.println(ans);
            return;
        }

        makeString(len-1, ans + '0'); // take 0
         if(ans.length()>= 1){ // basically back track kar lia
         char ch = ans.charAt(ans.length()-1);
         if(ch == '1') return;
         }
        makeString(len-1, ans + '1'); // take 1
        
    } 

    public static void main(String[] args) {
        makeString(3,"");
        method2("",3);
    }
}