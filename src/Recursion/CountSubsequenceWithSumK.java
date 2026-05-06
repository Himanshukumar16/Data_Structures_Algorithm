package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequenceWithSumK {
    public void countSubsequenceWithSumK(int[] arr, int k) {
        int totalSequence = 0;
        List<Integer> lst = new ArrayList<>();
        System.out.println(count(arr, k, 0, lst, 0, totalSequence));
    }

    private int count(int[] arr, int k, int sum, List<Integer> lst, int i, int total) {
        if (i >= arr.length) {
            if (sum == k) return 1;
            else return 0;
        }
        lst.add(arr[i]);
        sum += arr[i];
        int left = count(arr, k, sum, lst, i + 1, 0);
        lst.removeLast();
        sum -= arr[i];
        int right = count(arr, k, sum, lst, i + 1, 0);
        return left + right;
    }
}
