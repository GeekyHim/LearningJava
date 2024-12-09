package strings;

public class plusOperator {
    public static void main(String[] args) {
        System.out.println("Str"+"Str");
        System.out.println("Str"+10+20);
        System.out.println(10+20+"Str");
        System.out.println(10+"Str");
        System.out.println("Str"+10);
        String s = "abcd";
        s+= "pqr";
        System.out.println(s);
        // etc etc.
    }
}
