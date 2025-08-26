package Arrays;

public class ProductExceptSelf {

    public void productExceptSelf(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int j = 0;
            while(j == i && j < nums.length){
                j++;
            }
            while(i != j && j < nums.length) {
                nums[i] = nums[i] * nums[j];
                System.out.println("i : "+i);
                System.out.println("j : "+j);
                j++;
            }
            System.out.println();
        }
//        for(int i : nums){
//            System.out.println(i);
//        }
    }
}
