// Highest Occurring Element in an Array.
package Hashing_Basics;
import java.util.*;
public class HighestOccurringElementInArray {
    public static void main(String[] args) {
//        creating object of Hashmap...
        HashMap <Integer , Integer> map = new HashMap<>();

//        declaring Array...
        int[] arr = {-1,2,0,-4 ,1, -1, -4, -1};

//        putting contents in the HashMap...
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

//        printing content of the hashmap...
        System.out.println(map);

        System.out.println(map.keySet());

        int max = Integer.MIN_VALUE;
        int max_count = 0;
        for(int i : map.keySet()){
            if(map.get(i) > max_count){
                max_count = map.get(i);
                max = i;
            }
        }
        System.out.println(max);

    }
}
