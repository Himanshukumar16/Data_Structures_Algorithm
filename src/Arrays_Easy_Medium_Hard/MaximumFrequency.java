package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {
    public void maximumFrequency(String str) {


//        Brute-Force : TC -> O(n^2), SC -> O(1)...

        int maxVol = 0;
        int maxCons = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxVol = Math.max(maxVol, count);
            } else {
                maxCons = Math.max(maxCons, count);
            }
        }
        System.out.println(maxVol + maxCons);


//        Optimal : TC -> O(n), SC -> O(1)...

//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//        }
//        int maxVol = 0;
//        int maxCons = 0;
//        for (char i : map.keySet()) {
//            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
//                maxVol = Math.max(maxVol, map.get(i));
//            } else {
//                maxCons = Math.max(maxCons, map.get(i));
//            }
//        }
//        System.out.println(maxVol + maxCons);
    }
}
