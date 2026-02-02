package Binary_Search_Easy_Medium_Hard;

public class SearchElementInRotatedSortedArrayOne {
    public void searchElementInRotatedSortedArrayOne(int[] nums, int target) {

//        Brute : TC -> O(n), SC -> O(1).

//        int index = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) index = i;
//        }
//        System.out.println(index);


//        Optimal : TC -> O(log n), SC -> O(1).

        System.out.println(indexOfArray(nums, target));
    }

    public int indexOfArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}