package Arrays_Easy_Medium_Hard;

public class PrintMaximumSubArray {

    public void printMaximumSubArray(int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if(sum == 0) start = j;
            sum += nums[j];
            if (sum >= 0) {
                max = Math.max(sum, max);
                end = j;
            }
            if (sum < 0) {
                max = Math.max(sum, max);
                sum = 0;
            }
        }
        System.out.println(max);
        for (int i = start; i <= end ; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
