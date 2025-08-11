package Sorting_Part_2;

public class QuickSortdecending {
    public static void main(String[] args) {

        int[] arr = {10, 4, 6, 9, 5, 1};
        Recursion r = new Recursion();
        r.rec(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class Recursion {
    public void rec(int[] arr, int low, int high) {
        if (low < high) {
            int index = par(arr, low, high);
            rec(arr, low, index - 1);
            rec(arr, index + 1, high);
        }
    }

    public int par(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] >= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] < pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
        }
        return j;
    }
}