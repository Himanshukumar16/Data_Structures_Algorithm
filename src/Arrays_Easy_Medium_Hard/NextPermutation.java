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
        rev(nums,ind + 1, nums.length - 1);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }

    public void rev(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}