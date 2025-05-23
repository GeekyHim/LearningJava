import java.util.Arrays;

public class Sorting{
    public static void main(String[] args) {
        System.out.println("Sortint String");
        String s = "himanshu";
        char [] ch = s.toCharArray();
        Arrays.sort(ch);  // in-built function of Arrays class to sort an array
        for(char cha : ch){
            System.out.print(cha);
        } 

        StringBuilder sb = new StringBuilder("himanshu");
        char[] chArr = sb.toString().toCharArray(); 
        // converting sb to string and then to ch arr
        System.out.println("\nSorting String Builder");
        Arrays.sort(chArr);  
        for(char myChar : ch){
            System.out.print(myChar);
        } 
    }
}