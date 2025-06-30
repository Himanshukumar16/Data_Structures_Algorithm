// Print Anything N times Using recursion.

package Recursion;
public class PrintNTimes {
    public static void main(String[] args) {
        PrintNTime r = new PrintNTime();
        r.recur(10);
    }
}
class PrintNTime {
    int num = 0;
    public void recur(int n){
        if(num == n){
            return;
        }
        System.out.println("Hello, This is a sample of recursion..");
        num++;
        recur(n);
    }
}
