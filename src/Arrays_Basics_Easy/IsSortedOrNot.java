package Arrays_Basics_Easy;

public class IsSortedOrNot {
    public boolean isSorted(int[] arr) {
//      Brute Force -> O(n^2).

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]) return false;
            }
        }
        return true;


//        optimal solution -> O(n).

//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) return false;
//        }
//        return true;
    }
}
