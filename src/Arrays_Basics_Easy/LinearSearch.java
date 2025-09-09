package Arrays_Basics_Easy;

public class LinearSearch {
    public int linearSearch(int[] arr, int n) {
//        TC -> O(n) , SC -> O(1)...
        int out = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                out = i;
            }
        }
        System.out.print("Index of element is : ");
        return out;
    }
}
