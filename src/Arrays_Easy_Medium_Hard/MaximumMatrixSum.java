package Arrays_Easy_Medium_Hard;

public class MaximumMatrixSum {
    public void maximumatrixSum(int[][] matrix) {

        long sum = 0;
        long lowestPositive = Integer.MAX_VALUE;
        long count = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt <= 0) {
                    count++;
                    sum += -1 * anInt;
                    lowestPositive = Math.min(lowestPositive, Math.abs(anInt));
                } else {
                    sum += anInt;
                    lowestPositive = Math.min(lowestPositive, Math.abs(anInt));
                }
                lowestPositive = Math.min(lowestPositive, Math.abs(anInt));
            }
        }
        if (count % 2 == 0) System.out.println(sum);
        else {
            sum = sum - 2 * lowestPositive;
            System.out.println(sum);
        }
    }
}
