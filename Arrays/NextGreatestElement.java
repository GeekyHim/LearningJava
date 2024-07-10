package Arrays;
public class NextGreatestElement {
    public static void main(String[] args) {
    int [] arr = {1,25,36,45,8,6,9,1,2};
    int n = arr.length;
    int [] ans = new int[n];
    for(int i=0;i<n;i++){
        int max = -1; //Integer.MIN_VALUE; kyuki last element -1 chahiye isiliye.
        for(int j=i+1;j<n;j++){
            if(arr[j]>max) max = arr[j];
        }
        ans[i]=max;
    }
    for(int x : ans){
        System.out.print(x+" ");
    }
    }
}

