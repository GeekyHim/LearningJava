package MergeSort;

public class MergeTwoSortedArray {
    public static void print(int[] arr){
        for(int x: arr){
            System.out.print(x+" ");
        }System.out.println();
    }

    public static void merge(int[] a, int[]b, int[]c) { //Java me array ref se call hoti 
        // so no need to return 
        // also see leetcode question
        int i=0, j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++]; 
    }
    public static void main(String[] args) {
        int[] a = {10,30,50,60,80,90};
        int[] b = {21,42,72,78};
        print(a);
        print(b);
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
