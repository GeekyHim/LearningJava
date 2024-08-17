package TwoDArrayList;
import java.util.ArrayList;

public class STL {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr2.add(40);
        arr2.add(50);
        arr4.add(60);
        arr4.add(70);
        arr2.add(80);
        arr1.add(90);
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        
        for(int i=0; i<list.size();i++){
            for(int j =0;j<list.get(i).size();j++){ 
                //coz list.get(i) apne aap me ek arraylist hai
                System.out.print(list.get(i).get(j)+" ");
            }System.out.println();
        }
    }

}
