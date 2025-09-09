package Arrays_Easy_Medium_Hard;

public class MaximumConsecutiveOne {
    public void maximumConsecutiveOne(int[] nums) {

//        TC -> O(n), SC -> O(1)...

        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(count, max);
            } else count = 0;
        }

        System.out.println(max);
    }
}
