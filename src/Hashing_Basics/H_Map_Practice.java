// HashMap
package Hashing_Basics;
import java.util.*;
public class H_Map_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap< Integer, Integer > map = new HashMap<>();
        int[]arr = {1,2,3,5,3,1};
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
