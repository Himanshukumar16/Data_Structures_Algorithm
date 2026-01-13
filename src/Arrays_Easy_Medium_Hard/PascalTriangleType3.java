package Arrays_Easy_Medium_Hard;

import java.util.*;

public class PascalTriangleType3 {
    public void pascalTriangleType2(int numRow) {

        List<List<Integer>> outerLst = new ArrayList<>();
        for (int i = 0; i < numRow; i++) {
            long ans = 1;
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            for (int j = 1; j <= i; j++) {
                ans = ans * (i + 1 - j) / j;
                lst.add((int) ans);
            }
            outerLst.add(lst);
        }
        System.out.println(outerLst);
    }
}
