package strings;
public class Methods2 {
    public static void main(String[] args) {
        // toLowerCase
        String s = "Himanshu Gupta";
        String s2 = "is in 2nd Year";
        System.out.println(s); // no change
        s.toLowerCase(); // ye bs ek instance hai
        System.out.println(s); // no 
        // ese karke string me koi change nhi ata hai, bs ek baar ke liye hota hai
        // another option is
        // s = s.toLowerCase();
        System.out.println(s.toLowerCase()); // change
        String change = s.toLowerCase();
        System.out.println(change); //change

        System.out.println(s.toUpperCase());

        //concat()
        // ek piche ek string lgani hai
        s.concat(s2);// does nothing
        System.out.println(s);
        s = s.concat(s2);
        System.out.println(s);

    }
}
