package Arrays_Easy_Medium_Hard;

public class RotateElementByDPlaces {
    public void rotateelementbydplaces(int[] arr, int k) {

//        int n = k % arr.length;
//        for (int j = 0; j < n; j++) {
//            int temp = arr[arr.length - 1];
//            for (int i = arr.length - 2; i >= 0; i--) {
//                arr[i + 1] = arr[i];
//            }
//            arr[0] = temp;
//        }

        int n = arr.length;
        k = k % n;
        rev(arr, 0, n - k - 1);
        rev(arr, n - k, n - 1);
        rev(arr, 0, n - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void rev(int[] arr, int start, int end) {

        while (start < end){

            int temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;

            start++;
            end--;
        }
    }
}