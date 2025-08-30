package Arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public void intersectionOfTwoArrays(int[] nums1, int[] nums2) {


//        Brute-Force : Tc-> O(n1×n2), SC -> O(min(n1,n2))...

//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//            int point = nums1[i];
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums2[j] == point) {
//                    set.add(point);
//                }
//            }
//        }
//        int k = 0;
//        int[] arr = new int[set.size()];
//        for (Object i : set.toArray()) {
//            arr[k] = (int) i;
//            k++;
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }

//        Optimal : TC -> O(n+m), SC -> O(n+m)...

//        Set<Integer> set = new HashSet<>();
//        for(int i : nums1) {
//            set.add(i);
//        }
//        Set<Integer> result = new HashSet<>();
//        for(int j : nums2){
//            if(set.contains(j)) result.add(j);
//        }
//        for (int k : result) {
//            System.out.println(k);
//        }
    }
}
