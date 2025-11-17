package Arrays_Easy_Medium_Hard;

public class ShuffleTheArray {
    public void ShuffleTheArray(int[] nums,int n) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        int ind = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i < n) odd[i] = nums[i];
            else {
                even[ind] = nums[i];
                ind++;
            }
        }

        for(int i = 0; i < nums.length; i++) {

        }

        for(int i : nums){
            System.out.println(i);
        }
    }
}
