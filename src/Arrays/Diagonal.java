package Arrays;

import java.util.ArrayList;

public class Diagonal {
    public void diagonal(int[][] dimensions) {

//        Brute-Force Approach TC & SC -> O(n).....

//        double diagonalLength;
//        ArrayList<Double> al = new ArrayList<>();
//        for (int[] i : dimensions) {
//            diagonalLength = Math.sqrt((i[0] * i[0]) + (i[1] * i[1]));
//            al.add(diagonalLength);
//        }
//        double max = al.getFirst();
//        int k = 0;
//        int ind = k;
//        for (int j = 1; j < al.size(); j++) {
//            if (al.get(j) > max) {
//                max = al.get(j);
//                k = j;
//                ind = k;
//            }
//            if (al.get(j) == max && dimensions[j][0] * dimensions[j][1] > dimensions[ind][0] * dimensions[ind][1]) {
//                max = al.get(j);
//                k = j;
//                ind = k;
//            }
//            k++;
//        }
//        System.out.println(dimensions[ind][0] * dimensions[ind][1]);


//        Optimal Approach : TC -> O(n) SC -> O(1)..

        int maxArea = 0;
        int maxDiagonal = 0;

        for (int[] i : dimensions) {
            int height = i[0];
            int width = i[1];
            int dig = (height * height) + (width * width);
            int area = height * width;

            if (maxDiagonal < dig || (dig == maxDiagonal && area > maxArea)) {
                maxDiagonal = dig;
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
