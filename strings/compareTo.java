package strings;
public class compareTo {
    public static void main(String[] args) {
        // string1.compareTo(string2)
        // compare string 1 to string 2
        // comparison is done "LEXOGRAPHICALLY" (manner of a dictionary)
        String a = "abc";
        String b = "abc";
        System.out.println(a+" "+b+" "+a.compareTo(b));
        System.out.println("Same pr 0");
        String c = "abc";
        String d = "bbd";
        System.out.println(c+" "+d+" "+c.compareTo(d));
        System.out.println("a-b is -1");
        System.out.println(d+" "+c+" "+d.compareTo(c));
        System.out.println("b-a is 1");
        String e = "abcdddd";
        String f = "abc";
        System.out.println(e+" "+f+" "+e.compareTo(f));
        System.out.println("here 4 d are extra in string 1");
        System.out.println(f+" "+e+" "+f.compareTo(e));
        System.out.println("here 4 d are extra in string 2");
        String test = "hellohi";
        String test2 = "helloHi";
        System.out.println(test+" "+test2+" "+test.compareTo(test2));
        System.out.println("here h-H is done since ASCII value compared char by char");
    }
}
