package Binary_Search_Easy_Medium_Hard;

public class SingleElementInSortedArray {
    public void singleElementInSortedArray(int[] nums) {

//        Brute : TC -> O(n), SC -> O(1).

//        for (int i = 0; i < nums.length; i++) {
//            if (nums.length == 1) {
//                System.out.println(nums[0]);
//                break;
//            }
//            if (i == 0) {
//                if (nums[i] != nums[i + 1]) {
//                    System.out.println(nums[i]);
//                }
//            } else if (i == nums.length - 1) {
//                if (nums[i] != nums[i - 1]) {
//                    System.out.println(nums[i]);
//                }
//            } else {
//                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
//                    System.out.println(i);
//                }
//            }
//        }


//        Optimal : TC -> O(log n), SC -> O(1).

        int low = 1;
        int high = nums.length - 2;

        if (nums.length == 1) System.out.println(nums[0]);
        if (nums[0] != nums[1]) System.out.println(nums[0]);
        if (nums[nums.length - 1] != nums[nums.length - 2]) System.out.println(nums[nums.length - 1]);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                System.out.println(nums[mid]);
            }
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else high = mid - 1;

        }
    }
}
