// Incomplete !!!!.
package Arrays;

public class RotateArray189Leetcode {

    public void rotateArray189Leetcode(int[] arr, int k) {

//        for (int j = 0; j < k; j++) {
//            int temp = arr[arr.length - 1];
//            for (int i = arr.length - 2; i >= 0; i--) {
//                arr[i + 1] = arr[i];
//            }
//            arr[0] = temp;
//        }

        Rotate r = new Rotate();
        r.rotate(arr, arr.length - k, arr.length - 1, 0, 0);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class Rotate {
    public void rotate(int[] arr, int par, int high, int low, int j) {
        for(int i = low ; i < par; i++){
            int temp = arr[low];
            arr[low] = arr[par-low];
            arr[par-low] = temp;
        }

//        j = 0;
//        while (par + j <= high - j) {
//            int temp = arr[high - j];
//            arr[high - j] = arr[par + j];
//            arr[par + j] = temp;
//            par++;
//            j++;
//        }
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
    }
}