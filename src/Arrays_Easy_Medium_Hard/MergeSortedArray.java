package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

public class MergeSortedArray {
    public void mergeSortedArray(int[] num1, int[] num2, int n, int m) {

//        Brute Force -> TC -> O(n+m), SC -> O(n+m).

//        int[] arr = new int[n + m];
//        int left = 0;
//        int right = 0;
//        int index = 0;
//        while (left < n && right < m) {
//            if (num1[left] <= num2[right]) {
//                arr[index] = num1[left];
//                left++;
//            }
//            else {
//                arr[index] = num2[right];
//                right++;
//            }
//            index++;
//        }
//        while (left < n) {
//            arr[index] = num1[left];
//            index++;
//            left++;
//        }
//        while (right < m) {
//            arr[index] = num2[right];
//            index++;
//            right++;
//        }
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }


//        optimal 1 : TC -> O(min(n,m))+O(nlogn)+O(mlogm)

//        int left = num1.length - 1;
//        int right = 0;
//        while (left >= 0 && right < m) {
//            if (num1[left] > num2[right]) {
//                int temp = num1[left];
//                num1[left] = num2[right];
//                num2[right] = temp;
//            }
//            left--;
//            right++;
//        }
//        Arrays.sort(num1);
//        Arrays.sort(num2);
//        for (int i : num1) {
//            System.out.print(i+" ");
//        }
//        for (int i : num2) {
//            System.out.print(i+" ");
//        }


//        optimal 2 : TC -> O(), SC -> O().

        double len = n + m;
        double gap = Math.ceil(len);
        while (gap > 0) {
            int left = 0;
            double right = left + gap;
            while (right < len) {

            }
        }
    }
}
