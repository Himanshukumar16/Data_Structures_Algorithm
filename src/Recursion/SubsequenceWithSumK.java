package Recursion;

import java.util.*;

public class SubsequenceWithSumK {
    public void subsequenceWithSumK(int[] arr, int k) {
        List<Integer> lst = new ArrayList<>();
        System.out.println(isEqual(arr,k,lst,0,0));
    }
    private boolean isEqual(int[] arr, int k, List<Integer> lst, int i, int sum) {
        if (i == arr.length) {

            return sum == k;
        }
        lst.add(arr[i]);
        sum += arr[i];
        if (isEqual(arr, k, lst, i + 1, sum)) return true;
        lst.removeLast();
        sum -= arr[i];
        if (isEqual(arr,k,lst,i+1,sum)) return true;

        return false;
    }
}
