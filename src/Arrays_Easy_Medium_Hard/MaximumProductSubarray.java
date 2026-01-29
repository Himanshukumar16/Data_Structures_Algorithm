package Arrays_Easy_Medium_Hard;

public class MaximumProductSubarray {
    public void maximumProductSubarray(int[] nums) {

//        Brute : TC -> O(n^3), SC -> O(1).

//        int maxProduct = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                int product = 1;
//                for (int k = i; k <= j; k++) {
//                    product = product * nums[k];
//                }
//                maxProduct = Math.max(maxProduct, product);
//            }
//        }
//        System.out.println(maxProduct);


//        Better : TC -> O(n^2), SC -> O(1).

//        int maxProduct = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int product = 1;
//            for (int j = i; j < nums.length; j++) {
//                product = product * nums[j];
//                maxProduct = Math.max(maxProduct, product);
//            }
//        }
//        System.out.println(maxProduct);


//        Optimal : TC -> O(), SC -> O().

        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int sufix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            sufix *= nums[nums.length - i - 1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, sufix));
            if (nums[i] == 0) prefix = 1;
            if (nums[nums.length - i - 1] == 0) sufix = 1;
        }
        System.out.println(maxProduct);
    }
}
