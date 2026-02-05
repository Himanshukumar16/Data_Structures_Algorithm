package Binary_Search_Easy_Medium_Hard;

public class FindingSquareRoot {
    public void findingSquareRoot(int n) {

//        brute : TC -> O(n).

//        long ans = 1;
//        for (long i = 0; i <= n; i++) {
//            if (i * i <= (long)n) ans = i;
//            else break;
//        }
//        System.out.println(ans);


//        optimal : TC -> O(log n).

        int low = 0;
        int high = n;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((long)mid * mid <= (long)n) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(index);
    }
}
