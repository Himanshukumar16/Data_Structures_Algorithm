package Arrays_Easy_Medium_Hard;

public class PrintMaximumSubArray {

    public void printMaximumSubArray(int[] nums) {
        int start = 0;
        int sum = 0;
        int answerStart = 0;
        int answerEnd = 0;
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (sum == 0) start = j;
            sum += nums[j];
            if (sum >= 0) {
                max = Math.max(sum, max);
            }
            if (sum < 0) {
                max = Math.max(sum, max);
                sum = 0;
            }
            if (sum > max) {
                max = sum;
                answerStart = start;
                answerEnd = j;
            }
        }
        System.out.println(max);
        if (max <= 0) System.out.println("[]");
        for (int i = answerStart; i < answerEnd; i++) {
            System.out.print("[" + nums[i] + "]");
        }
    }
}