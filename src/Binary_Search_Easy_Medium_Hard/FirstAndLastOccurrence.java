package Binary_Search_Easy_Medium_Hard;

public class FirstAndLastOccurrence {
    public void firstAndLastOccurrence(int[] nums, int target) {
        int[] arr = new int[2];

//        Brute : TC -> O(n), SC -> O(1).

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target && arr[0] == -1) {
//                arr[0] = i;
//            } else if (nums[i] == target) arr[1] = i;
//        }
//        for (int i : arr) System.out.print(i + " ");


//        Optimal : TC -> O(log n), SC O(1).

        int first = firstIndex(nums, target);
        int last = secondIndex(nums, target);
        if (first == -1 || nums[first] != target) {
            arr[0] = -1;
            arr[1] = -1;
        } else {
            arr[0] = first;
            arr[1] = last;
        }
        for (int i : arr) System.out.print(i+" ");
    }

    public int firstIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return first;
    }

    public int secondIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                last = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return last;
    }
}