package Arrays;

public class LinearSearch {

    public int linearSearch(int[] arr, int n) {
//        TC -> O(n) , SC -> O(1)...
        int out = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                out = i;
            }
        }
        System.out.println("Position of element is : "+ (out + 1));
        System.out.print("Index Of element is : ");
        return out;
    }
}
