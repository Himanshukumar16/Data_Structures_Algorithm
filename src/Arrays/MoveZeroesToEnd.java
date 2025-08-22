package Arrays;

public class MoveZeroesToEnd {
    public void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[n - 1] = temp;
                n--;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
