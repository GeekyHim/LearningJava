public class PIP2 {
    

    public static void pip(int n){
        if( n ==0 ) return;
        System.out.println("pre :" +n);  // PRE WORK 
        pip(n-1);
        System.out.println("in  :" +n); // IN WORK 
        pip(n-1);
        System.out.println("post:" +n); // POST WORK 
    }

    public static void main(String[] args) {
        pip(3);
    }
}

