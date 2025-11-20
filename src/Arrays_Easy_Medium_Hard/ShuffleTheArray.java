package Arrays_Easy_Medium_Hard;

public class ShuffleTheArray {
    public void ShuffleTheArray(int[] nums,int n) {
//        TC -> O(n), SC -> O(n)...
        int[] odd = new int[nums.length / 2];
        int[] even = new int[nums.length / 2];
        int ind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < n) odd[i] = nums[i];
            else {
                even[ind] = nums[i];
                ind++;
            }
        }

        int oind = 0;
        int eind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = odd[oind];
                oind++;
            } else {
                nums[i] = even[eind];
                eind++;
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
