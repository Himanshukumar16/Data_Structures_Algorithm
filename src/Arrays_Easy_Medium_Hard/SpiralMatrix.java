package Arrays_Easy_Medium_Hard;

public class SpiralMatrix {
    public void spiralMatrix(int[][] matrix) {

//      Optimal solution : TC -> O(n^2), SC -> O(1)...

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[left][i] + " ");
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                System.out.print(matrix[j][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    System.out.print(matrix[j][left] + " ");
                }
                left++;
            }
        }
    }
}
