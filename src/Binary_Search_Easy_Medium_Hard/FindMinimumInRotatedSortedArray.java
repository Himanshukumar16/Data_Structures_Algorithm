package Binary_Search_Easy_Medium_Hard;

public class FindMinimumInRotatedSortedArray {
    public void findMinimumInRotatedSortedArray(int[] nums) {

//        Brute : TC -> O(n), SC -> O(1).

//        int min = nums[0];
//        for (int num : nums) {
//            if (min > num) min = num;
//        }
//        System.out.println(min);


//        Optimal : TC -> O(log n), SC -> O(1).

        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                min = Math.min(nums[low], min);
                low = mid + 1;
            } else {
                min = Math.min(nums[mid], min);
                high = mid - 1;
            }
        }
        System.out.println(min);
    }
}
