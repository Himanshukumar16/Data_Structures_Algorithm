package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public void twoSum(int[] nums, int target) {

//        Brute-Force : TC-> O(n^2), SC->O(1)...

        int[] arr = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target && i != j) {
//                    arr[0] = i;
//                    arr[1] = j;
//                }
//            }
//        }


//        Better & Optimal Solution : TC-> O(n), SC-> O(n).

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//            if(map.containsKey(target - nums[i])) {
//                arr[0] = map.get(target - nums[i]);
//                arr[1] = i;
//            }
//            map.put(nums[i], i);
//        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
