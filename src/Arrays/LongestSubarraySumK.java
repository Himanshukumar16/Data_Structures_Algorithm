package Arrays;

public class LongestSubarraySumK {
    public void longestSubarraySumK(int[] arr, int n) {

//        How to find Subarray :

//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i; j < arr.length; j++) {
//                for(int k = i; k < j;k++) {
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//        }


//        Brute-Force Approach 1: TC-> O(n^3), SC-> O(1).

//        int length = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if (sum == n) {
//                    length = Math.max(length, j - i + 1);
//                }
//            }
//        }
//        System.out.println(length);


//        Brute-Force Approach 2: TC-> O(n^2), SC-> O(1).

//        int length = 0;
//        for(int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for(int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum == n) length += 1;
//            }
//        }
//        System.out.println(length);


//        Better Approach : TC -> O(), SC -> O()...


    }
}
