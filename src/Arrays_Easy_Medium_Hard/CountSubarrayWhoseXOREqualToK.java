package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWhoseXOREqualToK {
    public void countSubarrayWhoseXOREqualToK(int[] nums, int n) {

//        Brute Force :-> TC -> O(n^3), SC -> O(1).

//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int xor = 0;
//            for (int j = i; j < nums.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    xor = xor ^ nums[k];
//                }
//                if (xor == n) count++;
//            }
//        }
//        System.out.println(count);


//        Better sol :-> TC -> O(n^2), SC -> O(1).

//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int xor = 0;
//            for (int j = i; j < nums.length; j++) {
//                xor = xor ^ nums[j];
//                if (xor == n) count++;
//            }
//        }
//        System.out.println(count);


//        Optimal sol :-> TC -> O(n), SC -> O(n).

        int count = 0;
        int xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            xor = num ^ xor;
            int reqXor = xor ^ n;
            if (map.containsKey(reqXor)) {
                count += map.get(reqXor);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        System.out.println(count);
    }
}