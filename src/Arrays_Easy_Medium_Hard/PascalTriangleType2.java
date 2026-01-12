package Arrays_Easy_Medium_Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleType2 {
    public void pascalTriangleType2(int numRows) {
//        Better sol :->

        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= numRows; i++) {
//            list.add(triangle(numRows, i));
//        }
//        System.out.println(list);

//        Optimal sol :->

        long ans = 1;
        list.add((int)ans);
        for (int i = 1; i <= numRows; i++) {
            ans = ans * (numRows +1 - i ) / i;
            list.add((int)ans);
        }
        System.out.println(list);
    }
//    public int triangle(int rows, int column) {
//        long res = 1;
//        for (int i = 0; i < column ; i++) {
//            res = res * (rows - i);
//            res = res / (i + 1);
//        }
//        return (int)res;
//    }
}
