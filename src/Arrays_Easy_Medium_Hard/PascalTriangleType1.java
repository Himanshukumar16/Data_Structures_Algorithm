package Arrays_Easy_Medium_Hard;

public class PascalTriangleType1 {
    public void pascalTriangleType1(int rows , int column) {

//        nCr = n!/r!(n-r)!

        int n = factorial(rows - 1);
        int r = factorial(column - 1);
        int nMinusR = factorial(rows - column - 2);

        System.out.println(n / (r * nMinusR));


    }

    private int factorial(int num) {

        int fact = 1;

        for (int i = 1; i < num; i++) {
            fact *= i;
        }

        return fact;
    }
}
