package Arrays_Easy_Medium_Hard;

import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveAndNegativeInArray {
    public void alternatePositiveAndNegativeInArray(int... arr) {
        int n = arr.length;

//        Case 1 : if positives == negatives. :

//        Brute-Force -> TC-> O(n) + O(n/2) ,SC-> O(n)

//        int[] pos = new int[n / 2];
//        int[] neg = new int[n / 2];
//        int pind = 0;
//        int nind = 0;
//
//        for (int j : arr) {
//            if (j > 0) {
//                pos[pind] = j;
//                pind++;
//            } else {
//                neg[nind] = j;
//                nind++;
//            }
//        }
//
//        for (int i = 0; i < n / 2; i++) {
//            arr[2 * i] = pos[i];
//            arr[2 * i + 1] = neg[i];
//        }


//        Optimal Solution -> TC-> O(n), SC-> O(n).

//        int[] ans = new int[n];
//        int pind = 0;
//        int nind = 1;
//        for (int j : arr) {
//            if (j > 0) {
//                ans[pind] = j;
//                pind = pind + 2;
//            } else {
//                ans[nind] = j;
//                nind = nind + 2;
//            }
//        }


//        Case 2: if the positives != negatives then :

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i : arr) {
            if(i > 0) pos.add(i);
            else neg.add(i);
        }
        for(int i = 0; i < Math.min(pos.size(), neg.size());i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        if(pos.size() > neg.size()) {
            int ind = 2 * neg.size();
            for(int i = neg.size();i < pos.size(); i++) {
                arr[ind] = pos.get(i);
                ind++;
            }
        }
        if(neg.size() > pos.size()) {
            int ind = 2 * pos.size();
            for(int i = pos.size();i < neg.size(); i++) {
                arr[ind] = neg.get(i);
                ind++;
            }
        }

//        for checking :
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
