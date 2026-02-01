package Binary_Search_Easy_Medium_Hard;

public class CeilInSortedArray {
    public void ceilInSortedArray(int[] arr, int x) {

//        Brute : TC -> O(n), SC -> O(1).

//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= x) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);


//        Optimal : TC -> O(log n), SC -> O(1).

        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                index = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(index);
    }
}
