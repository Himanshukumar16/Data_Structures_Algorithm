package Arrays_Easy_Medium_Hard;

public class AlternatePositiveAndNegativeInArray {
    public void alternatePositiveAndNegativeInArray(int... arr) {
        int n = arr.length;

//        Brute-Force -> TC-> O(n) + O(n/2) ,SC-> O(n)

//        int[] pos = new int[n / 2];
//        int[] neg = new int[n / 2];
//        int pind = 0;
//        int nind = 0;

//        for (int j : arr) {
//            if (j > 0) {
//                pos[pind] = j;
//                pind++;
//            } else {
//                neg[nind] = j;
//                nind++;
//            }
//        }

//        for (int i = 0; i < n / 2; i++) {
//            arr[2 * i] = pos[i];
//            arr[2 * i + 1] = neg[i];
//        }


//        Optimal Solution -> TC-> O(), SC-> O().

        int[] ans = new int[n];
        int pind = 0;
        int nind = 1;
        for (int j : arr) {
            if (j > 0) {
                ans[pind] = j;
                pind = pind + 2;
            } else {
                ans[nind] = j;
                nind = nind + 2;
            }
        }

//        for checking :
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
