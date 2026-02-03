package Binary_Search_Easy_Medium_Hard;

public class SearchElementInRotatedSortedArrayTwo {
    public void searchElementInRotatedSortedArrayTwo(int[] nums, int target) {

//        Brute : TC -> O(n), SC -> O(1).

//        boolean isPresent = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) isPresent = true;
//        }
//        System.out.println(isPresent);


//        optimal : TC -> O(log n), SC -> O(1).

        int low = 0;
        int high = nums.length - 1;
        boolean isPresent = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                isPresent = true;
                break;
            }
            if (nums[mid] == nums[low] && nums[low] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        System.out.println(isPresent);
    }
}
