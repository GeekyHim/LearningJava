package strings;
public class Methods {
    //startWith()
    //endsWith()
    //conatains()
    public static void main(String[] args) {
        String str = "Himanshu Gupta";
        System.out.println(str.contains("man")); //true
        System.out.println(str.contains("manH")); //false (not continuous)

        System.out.println(str.startsWith("H")); //true
        System.out.println(str.startsWith("Him")); //true 
        System.out.println(str.startsWith("Himanshu G")); //true 

        System.out.println(str.endsWith("Gupta")); //true
        System.out.println(str.endsWith("gupta")); //case matters -> hence ans is false
        System.out.println(str.endsWith("atpuG")); //false
    }
}
