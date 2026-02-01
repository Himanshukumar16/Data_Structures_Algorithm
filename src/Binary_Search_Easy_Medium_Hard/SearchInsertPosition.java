package Binary_Search_Easy_Medium_Hard;

public class SearchInsertPosition {
    public void searchInsertPosition(int[] nums, int n) {

//        Brute : TC -> O(n), SC -> O(1).

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= n) {
//                System.out.println(i);
//                break;
//            }
//        }


//        Optimal : TC -> (log n), SC -> O(1).

        int low = 0;
        int high = nums.length - 1;
        int index = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= n) {
                high = mid - 1;
                index = mid;
            } else low = mid + 1;
        }
        System.out.println(index);
    }
}
