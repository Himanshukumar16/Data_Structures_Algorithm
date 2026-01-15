package Arrays_Easy_Medium_Hard;

import java.util.*;

public class FourSum {
    public void fourSum(int[] nums,int target) {

//        Brute Force :-> TC -> O(n^4), SC ->O(no. of quadraplets).

//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < nums.length - 3; i++) {
//            for (int j = i + 1; j < nums.length - 2; j++) {
//                for (int k = j + 1; k < nums.length - 1; k++) {
//                    for (int l = k + 1; l < nums.length; l++) {
//                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
//                            List<Integer> lst = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
//                            Collections.sort(lst);
//                            set.add(lst);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(new ArrayList<>(set));


//        Better Solution : TC -> O(), SC -> O().


//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                Set<Integer> innerSet = new HashSet<>();
//                for (int k = j + 1; k < nums.length; k++) {
//                    long l = target - nums[i] - nums[j] - nums[k];
//                    if (innerSet.contains((int) l)) {
//                        List<Integer> lst = Arrays.asList(nums[i], nums[j], nums[k], (int) l);
//                        Collections.sort(lst);
//                        set.add(lst);
//                    } else innerSet.add(nums[k]);
//                }
//            }
//        }
//        System.out.println(new ArrayList<>(set));


//        Optimal Solution : TC -> O(), SC -> O().

        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target) l--;
                    else if (sum < target) k++;
                    else {
                        lst.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        l--;
                        k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                        while (k < nums.length && nums[k] == nums[k - 1]) k++;
                    }
                }
            }
        }
        System.out.println(lst);
    }
}
