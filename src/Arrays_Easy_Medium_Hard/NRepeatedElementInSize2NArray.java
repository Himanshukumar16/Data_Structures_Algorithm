package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public void nRepeatedElementInSize2NArray(int[] nums){
//        TC -> O(n^2)...
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == nums.length / 2) {
                System.out.println(nums[i]);
            }
        }

//        TC -> O(n),SC -> O(n)...
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == nums.length / 2) {
                System.out.println(i);
                break;
            }
        }

//        TC -> O(n), SC -> O(1)...
        for(int i = 0; i < nums.length; i++) {

        }
    }
}
