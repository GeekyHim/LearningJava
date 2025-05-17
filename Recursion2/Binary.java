public class Binary{
    public static void makeString(int len, String ans){
        if(0 == len){
            System.out.println(ans);
            return;
        }

        makeString(len-1, ans + '0'); // take 0
        makeString(len-1, ans + '1'); // take 1
    } 

    public static void main(String[] args) {
        makeString(3,"");
    }
}