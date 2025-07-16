package BasicMaths;
import java.util.*;
public class PracticeHashing {
    public static void main(String[] args) {
        jawab j = new jawab();
        int[] num = {2,3,3,3};
        String[] str = {"a","b","c","a","c","d","a"};
        j.countFrequencies(num);
        j.countFrequencies(str);
    }
}
class jawab{
    public void countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
    public void countFrequencies(String[] nums) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }

}
