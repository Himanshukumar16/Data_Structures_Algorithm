package Arrays;

public class LongestSubArrayOf1AfterDeletingOneElementLeetcode1493 {

    public void longestSubArrayOf1AfterDeletingOneElementLeetcode1493(int[] arr) {
        int[] count = new int[arr.length];
        int j = 0, out = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count[j] = check(arr, i, 0);
                j++;
            }
        }
        int max = count[0];
        for (int k : count) {
            if (max < k) max = k;
        }
        for (int k : arr) {
            if (k == 1) out++;
        }
        if (out == arr.length) System.out.println(arr.length - 1);
        System.out.println(max);
    }

    public int check(int[] arr, int i, int count) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == 0) break;
            count++;
        }
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] == 0) break;
            count++;
        }
        return count;
    }
}
