package Arrays_Easy_Medium_Hard;

public class PlusOne {
    public void plusone(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] = nums[i] + 1;
                return;
            }
            nums[i] = 0;
        }




//        for (int i : arr) {
//            System.out.println(i);
//        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
