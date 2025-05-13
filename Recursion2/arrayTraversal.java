public class arrayTraversal{

    public static void print(int [] arr,int len) {
        if(len < 0) return;
        print(arr, len-1);
        System.out.println("Index "+ len + " : " + arr[len]+" ");
    }

    public static void printM2(int n, int[] arr){
        if(n==arr.length) return;
        System.out.print(arr[n] + " ");
        printM2(n+1, arr);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        // for loop is iterative code
        // recursion is recursive code
        print(arr, arr.length-1);
        System.out.println();
        printM2(0, arr);
    }
}