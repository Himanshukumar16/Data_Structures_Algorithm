package Sorting_Part_2;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Recur r = new Recur();
        int[] arr = {151, 414, 163, 512, 911};
        r.recur(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class Recur {
    public void recur(int[] arr, int length) {
        if (length == 1) {
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recur(arr, length - 1);
    }
}
