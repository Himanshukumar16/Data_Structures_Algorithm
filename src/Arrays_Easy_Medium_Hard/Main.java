package Arrays_Easy_Medium_Hard;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Question 1 :
//        LargestElementInAnArray l = new LargestElementInAnArray();
//        l.largeNumber(new int[]{3, 2, 1, 4, 6, 5});

//        Question 2 :
//        SecondLargestElementInArray sl = new SecondLargestElementInArray();
//        sl.secondLargest(new int[]{3, 2, 1, 4, 6, 5});

//        Question 3 :
//        IsSortedOrNot is = new IsSortedOrNot();
//        System.out.println(is.isSorted(new int[]{0,2,5,9,70}));

//        Question 4 :
//        RemoveDuplicateFromSortedArray d = new RemoveDuplicateFromSortedArray();
//        System.out.println(d.removeDuplicateFromSortedArray(new int[]{-3,-1,0,0,0,3,3}));

//        Question 5 :
//        LeftRotateTheArrayByOnePlace r = new LeftRotateTheArrayByOnePlace();
//        r.leftRotateTheArrayByOnePlace(new int[]{1,2,3,4,5});

//        Leetcode 189 :
//        RotateArray189Leetcode r = new RotateArray189Leetcode();
//        r.rotateArray189Leetcode(new int[]{1,2,3,4,5,6,7}, 6);

//        Question 6 :
//        RotateElementByDPlaces r = new RotateElementByDPlaces();
//        r.rotateelementbydplaces(new int[]{1,2,3,4,5,6,7}, 3);

//        Question 7 :
//        MoveZeroesToEnd m = new MoveZeroesToEnd();
//        m.moveZeroesToEnd(new int[]{0,1,0,3,1,5,0,0,0,3,2});

//        Leetcode 27 :
//        RemoveElement27Leetcode r = new RemoveElement27Leetcode();
//        System.out.println(r.removeElement(new int[]{0,1,2,2,3,0,4,2},2));

//        Leetcode 2460 :
//        ApplyOperationsToAnArrayLeetcode a = new ApplyOperationsToAnArrayLeetcode();
//        a.applyOperationsToAnArrayLeetcode(new int[]{1,2,2,1,1,0});

//        Question 8 :
//        LinearSearch l = new LinearSearch();
//        System.out.println(l.linearSearch(new int[]{1,4,5,6,0,9,7}, 5));

//        Leetcode 1493 :
//        LongestSubArrayOf1AfterDeletingOneElementLeetcode1493 p = new LongestSubArrayOf1AfterDeletingOneElementLeetcode1493();
//        p.longestSubArrayOf1AfterDeletingOneElementLeetcode1493(new int[]{1,0,1,1,1,0,1,1,1,0,0,1});

//        leetcode 238 : incomplete -----------------------------------------------------------X------------------------
//        ProductExceptSelf p = new ProductExceptSelf();
//        p.productExceptSelf(new int[]{1,2,3,1,2,4});

//        Leetcode 3000 :
//        Diagonal d = new Diagonal();
//        d.diagonal(new int[][] {{25,60},{39,52},{16,63},{33,56}});

//        Leetcode 3658 :
//        GcdOfOddAndEven g = new GcdOfOddAndEven();
//        g.gcdOfOddAndEven(7);

//        Leetcode 35 :
//        SearchInsertPosition s = new SearchInsertPosition();
//        s.searchInsertPosition(new int[]{1,3,5,6},5);

//        Leetcode 3065 :
//        MinimumOperationsToExceedThresholdValue m = new MinimumOperationsToExceedThresholdValue();
//        m.minimumOperationsToExceedThresholdValue(new int[]{1,1,2,4,9},1);

//        Leetcode 2798 :
//        NumberOfEmployeesWhoMetTarget n = new NumberOfEmployeesWhoMetTarget();
//        n.numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2},6);

//        Question 9 :
//        UnionOfAnArray u = new UnionOfAnArray();
//        u.unionOfAnArray(new int[]{1, 2, 3, 4, 5, 5, 5}, new int[]{});

//        Leetcode 349 :
//        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
//        i.intersectionOfTwoArrays(new int[]{1,2,2,1},new int[]{2});

//        Leetcode  3668:
//        RestoreFinishingOrder m = new RestoreFinishingOrder();
//        m.restoreFinishingOrder(new int[]{3,1,2,5,4},new int[]{1,3,4});

//        Question 10 :
//        MissingValue m = new MissingValue();
//        m.missingValue(new int[]{9,6,4,2,3,5,7,0,1,8});

//        Question 11 :
//        MaximumConsecutiveOne m = new MaximumConsecutiveOne();
//        m.maximumConsecutiveOne(new int[]{1,0,1,1,0,1});

//        Leetcode 3516 :
//        FindClosestPerson f = new FindClosestPerson();
//        f.findClosestPerson(1,5,3);

//        Question 12 :
//        NumberAppearence na = new NumberAppearence();
//        na.numberAppearence(new int[]{4,4,5,5,8,1,2,1,2});

//        Question 13 :
//        LongestSubarraySumK l = new LongestSubarraySumK();
//        l.longestSubarraySumK(new int[]{1, 2, 3, 1, 1, 1, 1, 1}, 11);

//        Leetcode 1 :
//        TwoSum t = new TwoSum();
//        t.twoSum(new int[]{2,5,3,4}, 9);

//        Question 14 :
//        SortArrayConsitsOf0_1_2 s = new SortArrayConsitsOf0_1_2();
//        s.sortArrayConsitsOf0_1_2(new int[]{0, 2, 1, 0, 2, 1, 1, 2, 0, 0, 1});

//        Leetcode 3541 :
//        MaximumFrequency m = new MaximumFrequency();
//        m.maximumFrequency("successes");

//        Question 15 :
//        MajorityElement m = new MajorityElement();
//        m.majorityElement(new int[]{5, 2, 0, 5, 5});

//        Question 16 :
//        MaximumSubarraySum m = new MaximumSubarraySum();
//        m.maximumSubarraySum(new int[]{-2,-3,-1,-5});

//        Question 17 :
//        PrintMaximumSubArray m = new PrintMaximumSubArray();
//        m.printMaximumSubArray(new int[]{-5,6,-1});

//        Question 18 :
//        StockBuyAndSell s = new StockBuyAndSell();
//        s.stockBuyAndSell(new int[]{7,6,4,3,1});

//        Question 19 :
//        AlternatePositiveAndNegativeInArray a = new AlternatePositiveAndNegativeInArray();
//        a.alternatePositiveAndNegativeInArray(3, 1, -2, -5, 2, -4, -1, -6);

//        Question 20 :
//        NextPermutation n = new NextPermutation();
//        n.nextPermutation(new int[]{1,5,1});

//        Question 21 :
//        ConcatenationOfArray c = new ConcatenationOfArray();
//        c.concatenationOfArray(new int[]{1,2,3,4});

//        Question 22 :
//        ShuffleTheArray s = new ShuffleTheArray();
//        s.ShuffleTheArray(new int[]{2,5,1,3,4,7,9,0},4);

//        Question 23 :
//        MaxConsecutiveOne m = new MaxConsecutiveOne();
//        m.maxConsecutiveOne(new int[]{1, 2, 3});

//        Question 24 :
//        LeadersOfTheArray l = new LeadersOfTheArray();
//        l.leadersOfTheArray(new int[]{16, 17, 4, 3, 5, 2});

//        Question 25 :
//        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
//        l.longestConsecutiveSequence(new int[]{100,4,200,1,3,2});



    }
}