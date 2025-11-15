package Arrays_Easy_Medium_Hard;

public class ConcatenationOfArray {
    public void concatenationOfArray(int[] nums) {
        int[] arr = new int[2 * nums.length];

//        tc -> O(2n)..
//        int ind = 0;
//        for (int j : nums) {
//            arr[ind] = j;
//            ind++;
//        }
//        for (int num : nums) {
//            arr[ind] = num;
//            ind++;
//        }

//        tc -> O(n)..
        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[nums.length + i] = nums[i];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}