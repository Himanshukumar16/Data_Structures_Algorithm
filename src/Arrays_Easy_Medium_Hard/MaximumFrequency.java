package Arrays_Easy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {
    public void maximumFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int maxVol = 0;
        int maxCons = 0;
        for (char i : map.keySet()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                maxVol = Math.max(maxVol, map.get(i));
            } else {
                maxCons = Math.max(maxCons, map.get(i));
            }
        }
        System.out.println(maxVol + maxCons);
    }
}
