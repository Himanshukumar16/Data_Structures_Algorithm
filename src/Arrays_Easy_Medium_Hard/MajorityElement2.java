package Arrays_Easy_Medium_Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public void majorityElement2(int[] nums) {

//        Brute Force Solution : TC -> O(n^2), SC -> O(1).

        List<Integer> lst = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count > nums.length / 3 && (!lst.contains(nums[i]))) {
//                lst.add(nums[i]);
//            }
//        }
//        System.out.println(lst);


//        Better solution : TC -> O(n), SC -> O(n).

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int i : map.keySet()) {
//            if (map.get(i) > nums.length / 3) {
//                lst.add(i);
//            }
//        }
//        System.out.println(lst);


//        Optimal solution : TC -> O(n), SC -> O(1).

        int count1 = 0;
        int count2 = 0;
        int el1 = nums[0];
        int el2 = nums[0];
        for (int num : nums) {
            if (count1 == 0 && num != el2) {
                count1++;
                el1 = num;
            } else if (count2 == 0 && num != el1) {
                count2++;
                el2 = num;
            } else if (el1 == num) count1++;
            else if (el2 == num) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = count2 = 0;
        for (int num : nums) {
            if (el1 == num) count1++;
            if (el2 == num) count2++;
        }
        if (count1 > nums.length / 3) lst.add(el1);
        if (count2 > nums.length / 3 && el1 != el2) lst.add(el2);
        System.out.println(lst);
    }
}
