package Arrays;

public class LargestElementInAnArray {
    public void largeNumber(int[]arr){
        int large = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > large) large = arr[i];
        }
        System.out.println("The Largest Number In Array Is : "+large);
    }
}
