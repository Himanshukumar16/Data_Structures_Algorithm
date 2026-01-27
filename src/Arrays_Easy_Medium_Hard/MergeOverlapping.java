package Arrays_Easy_Medium_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {
    public void mergeOverlapping(int[][] intervals) {

//        Brute Force -> TC -> O(n^2), SC -> O(n).

        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
//
//        for (int i = 0; i < intervals.length; i++) {
//
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//
//            int j = i + 1;
//            while (j < intervals.length && intervals[j][0] <= end) {
//                end = Math.max(end, intervals[j][1]);
//                j++;
//            }
//
//            lst.add(Arrays.asList(start, end));
//            i = j - 1;
//        }


//      Optimal solution : TC -> O(nlogn), SC -> O(n).

        for (int[] interval : intervals) {
            if (lst.isEmpty() || lst.getLast().get(1) < interval[0]) {
                lst.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int last = lst.size() - 1;
                int maxLast = Math.max(lst.getLast().get(1), interval[1]);
                lst.get(last).set(1, maxLast);
            }
        }

        int[][] arr = new int[lst.size()][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = lst.get(i).get(j);
            }
        }

        for (int[] num : arr) {
            for (int nums : num) {
                System.out.print(nums+" ");
            }
            System.out.println();
        }
    }
}