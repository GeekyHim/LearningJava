package Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int [] a= {1,3,4,6,7,9,100};
        int [] b= {4,9,10,13,25,50};
        int n = a.length;
        int m = b.length;
        int y = m+n;
        int[] arr = new int[y];
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        if(j==m){ //take elements of a
            while(i<n){
                arr[k]=a[i];
                i++; k++;
            }
        }
        else{   // take elements of b
            while(j<m){
                arr[k]=b[j];
                j++; k++;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
