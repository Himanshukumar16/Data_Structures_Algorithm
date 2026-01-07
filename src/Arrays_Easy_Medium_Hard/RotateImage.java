package Arrays_Easy_Medium_Hard;

public class RotateImage {
    public void rotateImage(int[][] matrix) {
//        int[][] arr = new int[matrix.length][matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                arr[j][matrix.length - 1 - i] = matrix[i][j];
//            }
//        }
//        for(int[] i : arr) {
//            for(int j : i) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        optimal Solution :

        for(int i = 0; i < matrix.length - 1; i++) {
             for(int j = i + 1; j < matrix[i].length; j++) {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
        }
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
        for (int[]elements : matrix) {
            for (int element : elements) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
