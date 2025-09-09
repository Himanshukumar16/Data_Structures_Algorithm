package Arrays_Basics_Easy;

public class LeftRotateTheArrayByOnePlace {
    public void leftRotateTheArrayByOnePlace(int[] arr) {
//        optimal solution -> O(n).
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

//        for checking if solution is correct or not included in logic...
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
