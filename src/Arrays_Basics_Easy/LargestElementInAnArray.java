package Arrays_Basics_Easy;

public class LargestElementInAnArray {
    public void largeNumber(int[]arr){
//        brute force approach -> sort then get largest element by last index. tc -> O(NlogN).

//        TC -> O(n). (Optimal approach.)
        int large = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > large) large = arr[i];
        }
        System.out.println("The Largest Number In Array Is : "+large);
    }
}
