package Arrays_Easy_Medium_Hard;

public class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] nums) {

//        Brute Force :-> TC -> O(n^3) approx.

////        going through all the elements.
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//
////              checking if element is zero than change other to @(special character).
//
//                if (nums[i][j] == 0) {
//
////                    changing rows value.
//                    markRowZero(nums, i);
//
////                    changing column value.
//                    markColumnZero(nums, j);
//                }
//            }
//        }
//
////        changing element valued @(special character) to 0.
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//
////                if value is @(special character) change it to the 0.
//
//                if (nums[i][j] == '@') {
//                    nums[i][j] = 0;
//                }
//            }
//        }


//        Better Approach :-> TC -> n^2, SC -> O(n+m)...

//        array to store the index of number which contains 0.
//        int[] col = new int[nums[0].length];
//        int[] row = new int[nums.length];
//
////        iterating through the array to see if there is 0 in the matrix or not.
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
////                changing value to the special character.
//                if (nums[i][j] == 0) {
//                    col[j] = '@';
//                    row[i] = '@';
//                }
//            }
//        }
//
////        changing the value of special character to the 0.
//        for (int i = 0; i < row.length; i++) {
//            for (int j = 0; j < col.length; j++) {
//
//                if (row[i] == '@' || col[j] == '@') {
//                    nums[i][j] = 0;
//                }
//            }
//        }


//        Optimal solution :-> TC -> O(n^2), SC -> O(1).

        int col0 = 0;
        for(int i = 0; i < nums.length; i++) {
            col0 = '@';
            for(int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == 0) {
                    nums[i][0] = 0;
                    if(j != 0) nums[0][j] = 0;
                    else col0 = 0;
                }
            }
        }
        for(int i = 1; i < nums.length; i++) {
            for(int j = 1; j < nums[0].length; j++) {
                if(nums[i][0] == 0 || nums[0][j] == 0) {
                    nums[i][j] = 0;
                }
            }
        }
        if (nums[0][0] == 0) {
            for(int j = 1; j < nums[0].length; j++) nums[0][j] = 0;
        }
        if (col0 == 0) {
            for(int i = 0; i < nums.length; i++) nums[i][0] = 0;
        }

//        for printing Matrix :

        for (int[] i : nums) {
            for (int j : i) {
                System.out.print(j + " ");
            }

//            for printing the result in presentable way.
            System.out.println();
        }
    }

//    //    Changing column to @(special character).
//    public void markColumnZero(int[][] nums, int j) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i][j] != 0) {
//                nums[i][j] = '@';
//            }
//        }
//    }

//    //    changing rows to @(special character).
//    public void markRowZero(int[][] nums, int i) {
//        for (int j = 0; j < nums[i].length; j++) {
//            if (nums[i][j] != 0) {
//                nums[i][j] = '@';
//            }
//        }
//    }
}