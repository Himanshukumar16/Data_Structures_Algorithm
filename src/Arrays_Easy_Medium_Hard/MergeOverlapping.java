package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

public class MergeOverlapping {
    public void mergeOverlapping(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for (int[] n : intervals) {
            for (int i : n) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}