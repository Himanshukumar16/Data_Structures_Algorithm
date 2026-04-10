package Recursion;

public class ReverseArray {
    public void reverseArray(int[] arr) {

        reverse(arr, 0);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private void reverse(int[] arr, int i) {
        if (i == arr.length - i - 1) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse(arr,i+1);
    }
}
