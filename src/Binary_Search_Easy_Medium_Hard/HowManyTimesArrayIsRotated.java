package Binary_Search_Easy_Medium_Hard;

public class HowManyTimesArrayIsRotated {
    public void howManyTimesArrayIsRotated(int[] arr) {

//        brute : TC -> O(n), SC -> O(1).

//        int index = -1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                index = i + 1;
//                break;
//            }
//        }
//        System.out.println(index);


//        optimal : TC -> O(log n), SC -> O(1).

        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < min) {
                    min = Math.min(arr[mid], min);
                    index = mid;
                }
                high = mid - 1;
            }
        }
        System.out.println(index);
    }
}
