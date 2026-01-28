package Arrays_Easy_Medium_Hard;

public class MissingAndRepeatingNumber {
    public void missingAndRepeatingNumber(int[] arr, int n) {

//        Brute : TC -> O(n^2), SC -> O(1).

//        int repeat = 0;
//        int missing = 0;
//        for (int i = 1; i <= arr.length; i++) {
//            int count = 0;
//            for (int k : arr) {
//                if (k == i) count++;
//            }
//            if (count == 2) repeat = i;
//            if (count == 0) missing = i;
//        }
//        System.out.println(repeat);
//        System.out.println(missing);


//        Better : TC -> O(n), SC -> O(n).

//        int[] hashArr = new int[arr.length + 1];
//        for (int i : arr) {
//            hashArr[i] += 1;
//        }
//        for (int i = 1; i < hashArr.length; i++) {
//            if (hashArr[i] == 2) repeat = i;
//            if (hashArr[i] == 0) missing = i;
//        }
//        System.out.println(repeat + " " + missing);


//        Optimal : TC -> O(n), SC -> O(1).

//        int sum = 0;
//        int squareSum = 0;
//        for (int i : arr) {
//            sum += i;
//            squareSum += i * i;
//        }
//        int originalSum = n * (n + 1) / 2;
//        int originalSquareSum = n * (n + 1) * (2 * n + 1) / 6;
//        int xminusy = sum - originalSum;
//        int differenceSquareSum = squareSum - originalSquareSum;
//        int xplusy = differenceSquareSum / xminusy;
//        int repeted = (xminusy + xplusy) / 2;
//        int missing = xplusy - repeted;
//        System.out.println(repeted+" "+missing);

    }
}