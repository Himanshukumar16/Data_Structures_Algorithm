package Arrays;

public class MaximumConsecutiveOne {
    public void maximumConsecutiveOne(int[] nums) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                max = count;
            }
            else count = 0;
        }
        System.out.println(max);
    }
}
