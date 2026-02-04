package Binary_Search_Easy_Medium_Hard;

public class PeakElement {
    public void peakElement(int[] nums) {

//        Brute : TC -> O(n), SC -> O(1).

//        int index = -1;
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if ((i == 0 || nums[i] > nums[i - 1])
//                    && (i == n - 1 || nums[i] > nums[i + 1])) {
//                index = i;
//            }
//        }
//        System.out.println(index);


//        Optimal : TC -> O(log n), SC -> O(1).

        int low = 1;
        int high = nums.length - 2;

        if (nums.length == 1) System.out.println(0);
        if (nums[0] > nums[1]) System.out.println(0);
        if (nums[nums.length - 1] > nums[nums.length - 2]) System.out.println(nums.length - 1);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid+1]) {
                System.out.println(mid);
            }
            if (nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) {
                low = mid + 1;
            }else high = mid - 1;
        }
    }
}
