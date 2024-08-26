package MergeSort;

import java.util.logging.MemoryHandler;

public class MergeSort {

    public static void print(int[] arr) {
        for(int x : arr){
            System.out.print(x+" ");
        }System.out.println();    
    }

    public static void merge(int[]a,int[]b,int[]c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }

    public static void MergeSortProg(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0; i<n/2; i++){
            a[i] = arr[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i] = arr[i+n/2];
        }
        MergeSortProg(a);
        MergeSortProg(b);

        merge(a, b, arr);

    }

    public static void main(String[] args) {
        int[] arr = {80,60,20,15,90,78,75,20};
        print(arr);
        MergeSortProg(arr);
        print(arr);
    }
}
