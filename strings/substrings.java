package strings;
public class substrings {
    public static void main(String[] args) {
        String s = "Himanshu Gupta";
        System.out.println(s.substring(0)); // 0 se end tk 
        System.out.println(s.substring(5)); // 5 se end tk
        System.out.println(s.substring(0,13)); // 0 se 12 tk 
        System.out.println(s.substring(0,14)); // 0 se 13 tk
        // (index 14 doesnt even exist but pura print karana tha and j-1 tk chlata hai isiliye kara ye)
        System.out.println(s.substring(5,5)); // i,i yani same pe NO OUTPUT
    }
}
