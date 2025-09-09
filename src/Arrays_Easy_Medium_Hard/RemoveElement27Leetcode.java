package Arrays_Easy_Medium_Hard;
import java.util.ArrayList;

public class RemoveElement27Leetcode {

    public int removeElement(int[] arr, int val) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int k : arr) {
            if (k != val) al.add(k);
        }
        int j = 0;
        for (int i : al) {
            arr[j] = i;
            j++;
        }
        return al.size();
    }
}