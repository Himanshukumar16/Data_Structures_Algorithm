package Recursion;

public class Fibonnaci {
    public void fibonnaci(int n) {

        System.out.println(printFibonnaci(n));
    }

    private int printFibonnaci(int n) {
        if (n == 0) return 0;
        if (n == 2 || n == 1) return 1;
        return printFibonnaci(n - 1) + printFibonnaci(n - 2);
    }
}
