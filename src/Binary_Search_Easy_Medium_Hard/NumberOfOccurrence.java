package Binary_Search_Easy_Medium_Hard;

public class NumberOfOccurrence {
    public void numberOfOccurrence(int[] arr, int target) {

//        Brute : TC -> O(n), SC -> O(1).

//        int count = 0;
//        for (int j : arr) {
//            if (j == target) count++;
//        }
//        System.out.println(count);


//        Optimal : TC -> O(log n), SC -> O(1).

        int first = leftOccurrence(arr, target);
        if (arr[first] != target) {
            System.out.println(0);
        } else {
            int last = rightOccurrence(arr, target);
            System.out.println(last - first + 1);
        }
    }

    public int leftOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
                index = mid;
            } else low = mid + 1;
        }
        return index;
    }

    public int rightOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
                index = mid;
            } else high = mid - 1;
        }
        return index;
    }
}
