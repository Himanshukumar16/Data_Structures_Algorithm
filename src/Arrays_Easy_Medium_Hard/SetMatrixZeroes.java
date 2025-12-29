package Arrays_Easy_Medium_Hard;

public class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] nums) {

//        going through all the elements.

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

//              checking if element is zero than change other to @(special character).

                if (nums[i][j] == 0) {

//                    changing rows value.
                    markRowZero(nums, i);

//                    changing column value.
                    markColumnZero(nums, j);
                }
            }
        }

//        changing element valued @(special character) to 0.

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

//                if value is @(special character) change it to the 0.

                if (nums[i][j] == '@') {
                    nums[i][j] = 0;
                }
            }
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

    //    Changing column to @(special character).
    public void markColumnZero(int[][] nums, int j) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][j] != 0) {
                nums[i][j] = '@';
            }
        }
    }

    //    changing rows to @(special character).
    public void markRowZero(int[][] nums, int i) {
        for (int j = 0; j < nums[i].length; j++) {
            if (nums[i][j] != 0) {
                nums[i][j] = '@';
            }
        }
    }
}
