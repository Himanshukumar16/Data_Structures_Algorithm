package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubarraySumK {
    public void longestSubarraySumK(int[] arr, int n) {

//        How to find Subarray :

//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i; j < arr.length; j++) {
//                for(int k = i; k < j;k++) {
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//        }


//        Brute-Force Approach 1: TC-> O(n^3), SC-> O(1).

//        int length = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if (sum == n) {
//                    length = Math.max(length, j - i + 1);
//                }
//            }
//        }
//        System.out.println(length);


//        Brute-Force Approach 2: TC-> O(n^2), SC-> O(1).

//        int length = 0;
//        for(int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for(int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum == n) length += 1;
//            }
//        }
//        System.out.println(length);


//        Better Approach : TC -> O(), SC -> O()...

        Map<Long, Integer> map = new LinkedHashMap<>();
        long prefix = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (prefix == n) length = Math.max(length, i + 1);
            Integer m = map.get(prefix - n);
            if (map.get(prefix - n) != null) {
                length = Math.max(length, i - m);
            }
            if (!map.containsKey(prefix)) map.put(prefix, i);
        }
        System.out.println(map);
        System.out.println(length);
    }
}
