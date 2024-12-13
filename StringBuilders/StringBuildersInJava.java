package StringBuilders;
public class StringBuildersInJava {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "";

        StringBuilder sb1 = new StringBuilder();
        System.out.println("String Builder 1:");
        System.out.println("String: "+sb1);
        System.out.println("Length: "+sb1.length()); // deafault len
        System.out.println("Capacity: "+sb1.capacity()); //default cap
        System.out.println();

        StringBuilder sb2 = new StringBuilder(str1);
        System.out.println("String Builder 2:");
        System.out.println("String: "+sb2);
        System.out.println("Length: "+sb2.length()); // len -> str1 
        System.out.println("Capacity: "+sb2.capacity()); // cap -> str1 + default
        System.out.println();

        StringBuilder sb3 = new StringBuilder(str2);
        System.out.println("String Builder 3:");
        System.out.println("String: "+sb3);
        System.out.println("Length: "+sb3.length()); // len
        System.out.println("Capacity: "+sb3.capacity()); // cap
        System.out.println();

        StringBuilder sb4 = new StringBuilder(20);
        System.out.println("String Builder 4:");
        System.out.println("String: "+sb4);
        System.out.println("Length: "+sb4.length()); // len
        System.out.println("Capacity: "+sb4.capacity()); // cap
        

    }
}
