public class stringTraversal {

    public static void print(int n, String s){
        if(n==s.length()) return;
        // /System.out.print(s.charAt(n)+" ");
        System.out.print(s.charAt(n));
        print(n+1, s);
    }
    public static void main(String[] args) {
        String str = "Himanshu Gupta";
        print(0, str);
    }
}
