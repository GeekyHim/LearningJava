package strings;
public class Methods {
    //startWith()
    //endsWith()
    //conatains()
    public static void main(String[] args) {
        String str = "Himanshu Gupta";
        System.out.println(str.contains("man"));
        System.out.println(str.contains("manH"));

        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("Him"));
        System.out.println(str.startsWith("Himanshu G"));

        System.out.println(str.endsWith("Gupta"));
        System.out.println(str.endsWith("gupta"));// case matters
        System.out.println(str.endsWith("atpuG"));
    }
}
