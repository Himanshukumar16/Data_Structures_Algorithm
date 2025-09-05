package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberAppearence {
    public void numberAppearence(int[]arr) {

//        Brute-Force Approach : TC -> O(n^2), SC -> O(1)...

//        for (int check : arr) {
//            int count = 0;
//            for (int k : arr) {
//                if (check == k) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(check);
//                break;
//            }
//        }


//        Better Solution : TC -> O(n), SC -> O(max(arr))... (Only if Array is positive.)

//        int max = arr[0];
//        for(int i : arr) {
//            if(i > max) max = i;
//        }
//        int[] hash = new int[max+1];
//        for(int i : arr) {
//            hash[i] += 1;
//        }
//        int ind = 0;
//        for(int i : hash) {
//            if(i == 1) System.out.println(ind);
//            ind++;
//        }


//        Better Approach : TC -> O(n), SC -> O(n)...

//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        for(int i : arr) {
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        System.out.println(map);
//        for(int i : map.keySet()) {
//            if(map.get(i) == 1) System.out.println(i);
//        }


//        Optimal Solution (By XOR): TC -> O(n), SC -> O(1)...

//        int xor = 0;
//        for(int i : arr) {
//            xor = xor ^ i;
//        }
//        System.out.println(xor);
    }
}
