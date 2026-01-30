package Binary_Search_Easy_Medium_Hard;

public class BinarySearchToFindNInSortedArray {
    public void binarySearchToFindNInSortedArray(int[] nums, int target) {

//        iterative-Binary-Search :
        System.out.println(iterativeBinarySearch(nums, target));

//        recursive-Binary-Search :
        System.out.println(recursiveBinarySearch(nums, target, 0, nums.length - 1));
    }


//    TC -> O(log 2 n), SC -> O(1).

    public int iterativeBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }


//    TC -> O(log 2 n), SC -> O(1).

    public int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return recursiveBinarySearch(arr, target, mid + 1, high);
        return recursiveBinarySearch(arr, target, low, mid - 1);
    }
}