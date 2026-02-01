package Binary_Search_Easy_Medium_Hard;

public class FloorInSortedArray {
    public void floorInSortedArray(int[] arr, int x) {

//        Brute : TC -> O(n), SC -> O(1).

//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= x) index = Math.max(i, index);
//        }
//        System.out.println(index);


//        Optimal : TC -> O(log n), SC -> O(1).

        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                index = Math.max(mid, index);
                low = mid + 1;
            } else high = mid - 1;
        }
        System.out.println(index);
    }
}
