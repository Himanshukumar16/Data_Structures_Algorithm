package Sorting_Part_2;

public class Merge_Sort {
    public static void main(String[] args) {
        Sol s = new Sol();
        int[] arr = {5, 4, 3, 2, 10};
        s.sortMerge(arr, 0, 4);
    }
}

class Sol {
    public void sortMerge(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        sortMerge(arr, low, mid);
        sortMerge(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int i = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (left < right) {
                temp[i] = left;
                left++;
                i++;
            } else {
                temp[i] = right;
                right++;
                i++;
            }
        }
        while (left <= mid) {
            temp[i] = left;
            left++;
            i++;
        }
        while (right <= high) {
            temp[i] = right;
            right++;
            i++;
        }
        if (high - low >= 0) System.arraycopy(temp, 0, arr, low, high - low);
        for (int k : arr) {
            System.out.println(k + " ");
        }
    }
}
