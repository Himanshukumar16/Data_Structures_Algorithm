package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public void majorityElement(int[] nums) {

//        Brute-Force : TC- O(n^2), SC- O(1)...

//        int out = 0;
//        if (nums.length == 1) {
//            out = nums[0];
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) count++;
//            }
//            int n = nums.length / 2;
//            if (count > n && n > 0) {
//                out = nums[i];
//                break;
//            }
//        }
//        System.out.println(out);


//        Better Solution : TC - O(n), SC O(n)...

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        for (int i : map.keySet()) {
//            if (map.get(i) > nums.length / 2) {
//                System.out.println(i);
//            }
//        }


//        Optimal Solution : TC - O(n), SC - O(1)...

        int count = 1;
        int el = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                el = nums[i];
                count = 1;
            } else if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == el) {
                count++;
            }
        }
        if (count > nums.length / 2) System.out.println(el);
        else System.out.println(-1);
    }
}
