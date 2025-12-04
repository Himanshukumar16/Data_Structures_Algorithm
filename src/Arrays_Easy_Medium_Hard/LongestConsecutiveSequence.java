package Arrays_Easy_Medium_Hard;

public class LongestConsecutiveSequence {
    public void longestConsecutiveSequence(int[] nums) {

        int longest = 0;
        for (int j : nums) {
            int count = 1;
            while (ls(nums, j + 1)) {
                j++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);
    }

    private boolean ls(int[] nums, int num) {
        for (int j : nums) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
