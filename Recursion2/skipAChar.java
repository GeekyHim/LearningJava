public class skipAChar {

    public static void skip(int index, String str, char skipChar, String ans){
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(index)!=skipChar) ans += str.charAt(index);
        skip(index+1, str, skipChar, ans);


    }
    public static void main(String[] args) {
        String str = "Himanshu Gupta";
        char charToSkip = 'a';
        skip(0,str,charToSkip,"");
    }
}
