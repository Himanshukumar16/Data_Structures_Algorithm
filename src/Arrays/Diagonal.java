package Arrays;

import java.util.ArrayList;

public class Diagonal {
    public void diagonal(int[][] dimensions) {
        double diagonalLength;
        ArrayList<Double> al = new ArrayList<>();
        for (int[] i : dimensions) {
            diagonalLength = Math.sqrt((i[0] * i[0]) + (i[1] * i[1]));
            al.add(diagonalLength);
        }
        double max = al.getFirst();
        int k = 0;
        int ind = k;
        for (int j = 1; j < al.size(); j++) {
            if (al.get(j) > max) {
                max = al.get(j);
                k = j;
                ind = k;
            }
            if (al.get(j) == max && dimensions[j][0] * dimensions[j][1] > dimensions[ind][0] * dimensions[ind][1]) {
                max = al.get(j);
                k = j;
                ind = k;
            }
            k++;
        }
        System.out.println(dimensions[ind][0] * dimensions[ind][1]);
    }
}
