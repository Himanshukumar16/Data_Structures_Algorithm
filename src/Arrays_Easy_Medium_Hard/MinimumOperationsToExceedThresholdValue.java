package Arrays_Easy_Medium_Hard;

public class MinimumOperationsToExceedThresholdValue {
    public void minimumOperationsToExceedThresholdValue(int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < n) count++;
        }
        System.out.println(count);
    }
}
