package Arrays_Easy_Medium_Hard;

public class ApplyOperationsToAnArrayLeetcode {
    public void applyOperationsToAnArrayLeetcode(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j != -1) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}