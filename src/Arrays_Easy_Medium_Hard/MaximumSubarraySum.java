package Arrays_Easy_Medium_Hard;

public class MaximumSubarraySum {

    public void maximumSubarraySum(int[] arr) {

//        Brute Force Solution : TC->O(n^3), SC->O(1)..

//        int out = 0;
//        int length = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                length = Math.max(sum, length);
//            }
//        }
//        if(arr.length == 1) {
//            out = arr[0];
//        }else {
//            out = length;
//        }
//        System.out.println(out);


//        Better solution : TC -> O(n^2), SC->O(1)...

//        int length = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                length = Math.max(sum, length);
//            }
//        }
//        if(arr.length == 1) {
//            System.out.println(arr[0]);
//        }else {
//            System.out.println(length);
//        }


//        Optimal Solution : Kadane's Algorithm
//        TC-> O(n), SC-> O(1).

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum >= 0) {
                max = Math.max(sum, max);
            } else sum = 0;
        }
        System.out.println(max);

    }
}
