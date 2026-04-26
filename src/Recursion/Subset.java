package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public void subset(int[] nums) {

        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();

        System.out.println(getSubset(lst, nums, outerList, 0));
    }

    private List<List<Integer>> getSubset(List<Integer> lst, int[] nums, List<List<Integer>> outerList, int i) {

        if (i >= nums.length) {
            outerList.add(new ArrayList<>(lst));
            return outerList;
        }
        lst.add(nums[i]);
        getSubset(lst,nums,outerList,i+1);

        lst.removeLast();
        getSubset(lst,nums,outerList,i+1);
        return outerList;
    }
}
