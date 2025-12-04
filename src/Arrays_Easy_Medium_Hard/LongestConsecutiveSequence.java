package Arrays_Easy_Medium_Hard;

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

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        int longest = 0;
//        int cursmall = Integer.MIN_VALUE;
//        int count = 1;



        for(int i : nums) {
            System.out.print(i+" ");
        }
    }

//    private boolean ls(int[] nums, int num) {
//        for (int j : nums) {
//            if (j == num) {
//                return true;
//            }
//        }
//        return false;
//    }

}
