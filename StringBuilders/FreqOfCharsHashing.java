public class FreqOfCharsHashing {
    public static void main(String[] args) {
        String s = "aaabcar";
        int[] intArr = new int[26];
        char[] ch = s.toCharArray();
        for(char ele : ch ){
            int temp = (int) ele;
            // ascii value of a = 97
            intArr[temp-97] = intArr[temp-97] + 1;
        }
        for(int i=0;i<26;i++ ){ 
            int mychar = i + 97;
            char temp = (char) mychar;  
            System.out.println(temp + " : "  + intArr[i]);
        }
        System.out.println("\n\n\nMax Occuring Characters: ");
        int max = 0;
        for(int i=0;i<26;i++ ){ 
            if(max<intArr[i]) max = intArr[i];    
        }
        for(int i=0;i<26;i++ ){ 
            if(max==intArr[i]) {
                char temp = (char) (i + 97);
                System.out.println(temp + " : " + intArr[i]);
            }    
        }
    }
}
