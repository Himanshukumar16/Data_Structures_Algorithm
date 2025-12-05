package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

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


//        Optimal solution :


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
