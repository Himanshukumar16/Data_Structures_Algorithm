package Arrays_Easy_Medium_Hard;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicateFromSortedArray(int[] arr) {
//        Brute Force ->

        Set<Integer>set = new LinkedHashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int ind = 0;
        for(int i : set){
            arr[ind] = i;
            ind++;
        }
        return ind;



//        Optimal approach -> O(N).

//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                arr[i + 1] = arr[j];
//                i++;
//            }
//        }
//        return i + 1 ;
    }
}
