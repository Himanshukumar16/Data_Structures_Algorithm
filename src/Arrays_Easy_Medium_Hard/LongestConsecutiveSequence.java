package Arrays_Easy_Medium_Hard;

import java.util.*;

public class LongestConsecutiveSequence {
    public void longestConsecutiveSequence(int[] nums) {

//        Brute :->

//        int longest = 0;
//        for (int j : nums) {
//            int count = 1;
//            while (ls(nums, j + 1)) {
//                j++;
//                count++;
//            }
//            longest = Math.max(longest, count);
//        }
//        System.out.println(longest);


//        Better :->

//        Arrays.sort(nums);
//        int longest = 0;
//        int lstsmall = Integer.MIN_VALUE;
//        int count = 1;
//        for (int num : nums) {
//            if (num - 1 == lstsmall) {
//                count++;
//                lstsmall = num;
//            } else if (num != lstsmall) {
//                count = 1;
//                lstsmall = num;
//            }
//            longest = Math.max(longest, count);
//        }
//        System.out.println(longest);


//        Optimal solution : Tc -> O(n); SC -> O(n)....

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longest = Integer.MIN_VALUE;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int x = i + 1;
                while (set.contains(x)) {
                    count++;
                    x++;
                }
                longest = Math.max(count, longest);
            }
        }
        System.out.println(longest);
    }


//    ls function:
//    private boolean ls(int[] nums, int num) {
//        for (int j : nums) {
//            if (j == num) {
//                return true;
//            }
//        }
//        return false;
//    }

}
