package Arrays;

import java.util.*;

public class UnionOfAnArray {
    public void unionOfAnArray(int[] arr1, int[] arr2) {

//        Brute-Force Approach : TC , SC -> O(n+m)..

//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < arr1.length; i++ ){
//            set.add(arr1[i]);
//        }
//        for(int i = 0; i < arr2.length; i++){
//            set.add(arr2[i]);
//        }
//        int [] arr = new int[set.size()];
//        int j = 0;
//        for( Object i : set.toArray()){
//            arr[j] = (int)i;
//            j++;
//        }
//        for(int i : arr){
//            System.out.println(i);
//        }


//        Optimal Solution :

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArr = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {

                unionArr.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionArr.add(arr2[j]);
                j++;
            } else if (arr1[i] == arr2[j]) {
                unionArr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n1) {
            unionArr.add(arr1[i]);
            i++;
        }
        while (j < n2) {
            unionArr.add(arr2[j]);
            j++;
        }
        for (int k : unionArr) {
            System.out.println(k);
        }
    }
}
