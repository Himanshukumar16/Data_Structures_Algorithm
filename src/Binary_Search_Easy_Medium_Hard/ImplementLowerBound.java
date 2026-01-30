package Binary_Search_Easy_Medium_Hard;

public class ImplementLowerBound {
    public void implementLowerBound(int[] arr, int target) {

//        Brute : TC -> O(n), SC -> O(1).

//        int index = arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) index = Math.min(i, index);
//            else if (arr[i] > target) index = Math.min(i, index);
//        }
//        System.out.println(index);


//        Optimal : TC -> O(log n), SC -> O(1).

        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
                index = mid;
            } else low = mid + 1;
        }
        System.out.println(index);
    }
}
