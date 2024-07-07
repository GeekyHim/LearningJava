package Arrays;
public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        int [] arr = {1,2,0,1,2,0,1,0,2,0,1};
        int n = arr.length;
        int mid = 0, lo = 0, hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp = arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

