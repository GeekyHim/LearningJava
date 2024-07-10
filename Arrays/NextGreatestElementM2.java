package Arrays;

public class NextGreatestElementM2 {
public static void main(String[] args) {
    int [] arr = {1,25,36,45,8,6,9,1,2};
    int n = arr.length;
    int [] ans = new int[n];
    ans[n-1]=-1;
    int nge = arr[n-1];
    for(int i=n-2;i>=0;i--){
        ans[i]=nge;
        nge = Math.max(nge, arr[i]);
    }
    for(int x : ans){
        System.out.print(x+" ");
    }
}
}
