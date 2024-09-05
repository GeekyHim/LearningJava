package MergeSort;
public class InversionCountBruteForce {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        System.out.println(count);
    }
}
