package Arrays_Easy_Medium_Hard;

public class MaxConsecutiveOnes {
    public void maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 0) {
                count = 0;
            }else {
                count++;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount);
    }
}
