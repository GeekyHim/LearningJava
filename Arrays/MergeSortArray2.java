package Arrays;

public class MergeSortArray2 {
    public static void main(String[] args) {
        int [] a= {1,3,4,6,7,9,100};
        int [] b= {4,9,10,13,25,50};
        int n = a.length;
        int m = b.length;
        int y = m+n;
        int[] arr = new int[y];
        int i=n-1,j=m-1,k=n+m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                arr[k]=a[i];
                i--;
            }
            else{
                arr[k]=b[j];
                j--;
            }
            k--;
        }
        if(i>=0){
            while(i>=0){
                arr[k]=a[i];
                i--; k--;
            }
        }
        else if(j>=0){
            while(j>=0){
            arr[k]=b[j];
            k--;j--;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
