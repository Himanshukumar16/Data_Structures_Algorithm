package Binary_Search_Easy_Medium_Hard;

public class SearchElementInRotatedSortedArrayTwo {
    public void searchElementInRotatedSortedArrayTwo(int[] nums, int target) {

        boolean isPresent = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) isPresent = true;
        }
        System.out.println(isPresent);
    }
}
