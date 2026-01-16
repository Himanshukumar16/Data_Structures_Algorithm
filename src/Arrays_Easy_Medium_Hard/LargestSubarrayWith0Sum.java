package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWith0Sum {
    public void largestSubarrayWith0Sum(int[] arr) {

//        Brute Force :->

//        int maxLength = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if (sum == 0) {
//                    maxLength = Math.max(j - i + 1, maxLength);
//                }
//            }
//        }
//        System.out.println(maxLength);


//        Optimal sol :->

        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) maxLength = i + 1;
            if (map.get(sum) != null) {
                maxLength = Math.max(i - map.get(sum), maxLength);
            } else map.put(sum, i);
        }
        System.out.println(maxLength);
    }
}
