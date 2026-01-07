package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

public class SetMismatch {
    public void setMismatch(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                arr[0] = nums[i];
            }

        }
    }
}
