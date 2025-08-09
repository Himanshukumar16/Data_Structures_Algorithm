package Sorting_Part_2;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 6, 9, 5, 4, 1};
        Rec r = new Rec();
        r.rec(arr, 0, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class Rec {
    public void rec(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        rec(arr, i + 1, n);
    }
}
