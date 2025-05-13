
public class PreInPost {

    public static void pip(int n){
        if( n ==0 ) return;
        System.out.println(n);  // PRE WORK 
        pip(n-1);
        System.out.println(n); // IN WORK 
        pip(n-1);
        System.out.println(n); // POST WORK 
    }

    public static void main(String[] args) {
        pip(3);
    }
}
