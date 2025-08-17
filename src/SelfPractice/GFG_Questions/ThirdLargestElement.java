package SelfPractice.GFG_Questions;

public class ThirdLargestElement {
    public int thirdlargestelement(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        int large = arr[0];
        int slarge = Integer.MIN_VALUE;
        int tlarge = Integer.MIN_VALUE;

        for (int j : arr) {
            if (large < j) {
                tlarge = slarge;
                slarge = large;
                large = j;
            } else if (j > slarge && j < large) {
                tlarge = slarge;
                slarge = j;
            } else if (j > tlarge && j <= slarge) {
                tlarge = j;
            }
        }
        return tlarge;
    }
}