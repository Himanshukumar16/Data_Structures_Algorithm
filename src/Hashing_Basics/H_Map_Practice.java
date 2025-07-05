// HashMap
package Hashing_Basics;
import java.util.*;
public class H_Map_Practice {
    public static void main(String[] args) {
        HashMap< Integer, Integer > map = new HashMap<>();
        int[]arr = {1,1,1,2,2,3,3,3,4,4,5};
        for(int i = 0; i < arr.length; i++){
//            getOrDefault() -> It is used to retrieve the value for a given key from the map.
//                      If the key is not present, instead of returning null, it returns a default value that you provide.
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
