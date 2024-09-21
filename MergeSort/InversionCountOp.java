package MergeSort;

public class InversionCountOp {
    static int count; //globally declare kar dia
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else{ //a[i] > b[j] yani inversion mil gyi
                count += (a.length-i);
                c[k++]=b[j++];
            }
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    
    public static void inversion(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[n/2+i];
        }

        inversion(a);
        inversion(b);
        merge(a, b, arr);
        a = null;
        b = null;
    }
    public static void main(String[] args) {
        count = 0;
        int[] arr = {8,2,5,3,1,4};
        inversion(arr);
        System.out.print("Total Inversions are "+count);
    }
}
