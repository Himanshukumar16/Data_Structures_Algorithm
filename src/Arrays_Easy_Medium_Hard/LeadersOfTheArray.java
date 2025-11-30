package Arrays_Easy_Medium_Hard;

import java.util.ArrayList;

public class LeadersOfTheArray {
    public void leadersOfTheArray(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

//        Brute :->

        for (int i = 0; i < arr.length - 1; i++) {
            boolean lead = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    lead = false;
                    break;
                }
            }
            if (lead) {
                al.add(arr[i]);
            }
        }
        al.add(arr[arr.length - 1]);


//        Optimal Solution :->

        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                al.addFirst(arr[i]);
                max = arr[i];
            }
        }

        System.out.println(al);
    }
}
