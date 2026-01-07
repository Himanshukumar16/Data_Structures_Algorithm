package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualToK {
    public void countSubarraySumEqualToK(int[] arr, int n) {

//      Brute : TC -> O(n^3)

//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if (sum == n) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        better : TC -> O(n^2)

//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == n) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        Optimal : TC -> O(n), SC -> O(n)...

        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int j : arr) {
            preSum += j;
            if (map.containsKey(preSum - n)) {
                count += map.get(preSum - n);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(count);
    }
}
