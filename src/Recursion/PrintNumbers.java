package Recursion;

public class PrintNumbers {
    public void printNumbers() {
        int n = 10;
        printNumber(1,n);
    }
    private void printNumber(int cnt,int n) {
        if (cnt > n) return;
        System.out.print(cnt + " ");
        printNumber(cnt + 1, n);
    }
}