package Arrays_Easy_Medium_Hard;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        int indValue = Integer.MAX_VALUE;
        int preInd = 0;
        if (ind != -1) {
            for (int i = ind + 1; i < nums.length; i++) {
                if (nums[i] > nums[ind] && nums[i] < indValue) {
                    indValue = nums[i];
                    preInd = i;
                }
            }
            nums[preInd] = nums[ind];
            nums[ind] = indValue;
        }
        for (int i = ind + 1; i < nums.length - 1; i++) {
            for (int j = ind + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}