package Recursion;

public class PrintNTimes {
    public void printNTimes() {
        int n = 5;
        print(0, n);
    }

    private void print(int i, int n) {
        if (i >= n) return;
        System.out.println("Hello " + i);
        print(i + 1, n);
    }
}
