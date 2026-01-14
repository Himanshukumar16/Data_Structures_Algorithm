package Arrays_Easy_Medium_Hard;

import java.util.*;

public class ThreeSum {
    public void threeSum(int[] nums){

//        Brute Force :-> O(n^3), SC -> O(n^3).

//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> innerList = Arrays.asList(nums[i], nums[j], nums[k]);
//                        Collections.sort(innerList);
//                        set.add(innerList);
//                    }
//                }
//            }
//        }
//        System.out.println(new ArrayList<>(set));


//        Better sol :-> TC -> O(n^2), SC -> O(n^2).

//        Set<List<Integer>> outerSet = new HashSet<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            Set<Integer> set = new HashSet<>();
//            for (int j = i + 1; j < nums.length; j++) {
//                int k = -1 * (nums[i] + nums[j]);
//                if (set.contains(k)) {
//                    List<Integer> lst = Arrays.asList(nums[i], nums[j], k);
//                    Collections.sort(lst);
//                    outerSet.add(lst);
//                } else set.add(nums[j]);
//            }
//        }
//        System.out.println(new ArrayList<>(outerSet));


//        Optimal Sol : TC -> O(n^2), SC -> O(1).

//        List<List<Integer>> outerList = new ArrayList<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//            int j = i + 1;
//            int k = nums.length - 1;
//            while (j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if (sum > 0) k--;
//                else if (sum < 0) j++;
//                else {
//                    List<Integer> lst = Arrays.asList(nums[i], nums[j], nums[k]);
//                    outerList.add(lst);
//                    j++;
//                    k--;
//                    while (j < k && nums[j] == nums[j - 1]) j++;
//                    while (k > 0 && nums[k] == nums[k + 1]) k--;
//                }
//            }
//        }
//        System.out.println(outerList);

    }
}
