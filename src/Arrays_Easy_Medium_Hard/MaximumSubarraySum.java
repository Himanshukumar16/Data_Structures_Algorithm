package Arrays_Easy_Medium_Hard;

public class MaximumSubarraySum {

    public void maximumSubarraySum(int[] arr) {
        int length = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                length = Math.max(sum, length);
            }
        }
        if(arr.length == 1) {
            System.out.println(arr[0]);
        }else {
            System.out.println(length);
        }
    }
}
