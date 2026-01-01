package Arrays_Easy_Medium_Hard;

public class PlusOne {
    public void plusone(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] = nums[i] + 1;
                break;
            }
            nums[i] = 0;
        }
        int[] res = new int[nums.length+1];
        res[0] = 1;
        if (nums[0] == 0) {
            System.out.print("For having starting with 9 : ");
            for (int i : res) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("For not having starting with 9 : ");
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
