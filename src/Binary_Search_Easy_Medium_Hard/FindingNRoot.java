package Binary_Search_Easy_Medium_Hard;

public class FindingNRoot {
    public void findingNRoot(int n, int m) {

//        brute : TC -> O(m^1/n), SC -> O(1).

//        int index = -1;
//        for (int i = 0; i < m; i++) {
//            if ((long) Math.pow(i, n) == (long) m) {
//                index = i;
//            } else if ((long) Math.pow(i, n) > (long) m) {
//                break;
//            }
//        }
//        System.out.println(index);


//        optimal : TC -> O(log m).

        int index = -1;
        int low = 0;
        int high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, n) == m) {
                index = mid;
            }
            if (Math.pow(mid, n) < m) {
                low = mid + 1;
            } else high = mid - 1;
        }
        System.out.println(index);
    }
}