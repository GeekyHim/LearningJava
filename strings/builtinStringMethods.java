package strings;
public class builtinStringMethods {
    // str.charAT()
    // str.length()
    public static void main(String[] args) {
        String s = "Himanshu Gupta";
        System.out.println(s.charAt(4));
        // agar uski length se zyada pe charAt() lgaya toh error ayega
        int n = s.length();
        System.out.println(n);
        /*
         * For any array arr ->
         * n = arr.length
         * for any String s
         * n = s.length()
         * so we see that in string () is imp.
         */
    }
}
