package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

public class CountInversion {
    public void countInversion(int[] arr) {

//        Brute : TC -> O(n^2), SC -> O(1).

//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) count++;
//            }
//        }
//        System.out.println(count);


//        optimal : TC -> O(nlogn), SC -> O(n).

        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }

    public int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr,low,mid,high);
        return count;
    }

    private int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int[] temp = new int[high - low + 1];
        int left = low;
        int index = 0;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            }
            else {
                count += mid - left + 1;
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while (left <= mid) {
            temp[index] = arr[left];
            index++;
            left++;
        }
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }
        System.arraycopy(temp, 0, arr, low, temp.length);
        return count;
    }
}
