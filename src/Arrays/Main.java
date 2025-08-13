package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Question 1 : O(n)
        LargestElementInAnArray l = new LargestElementInAnArray();
        l.largeNumber(new int[]{3, 2, 1, 4, 6, 5});

//        Question 2 :
        SecondLargestElementInArray sl = new SecondLargestElementInArray();
        sl.secondLargest(new int[]{3, 2, 1, 4, 6, 5});
    }
}
