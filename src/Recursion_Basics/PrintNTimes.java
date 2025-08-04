// Print Anything N times Using recursion.

package Recursion_Basics;
public class PrintNTimes {
    public static void main(String[] args) {
        PrintTime r = new PrintTime();
        r.recur(10);
    }
}
class PrintTime {
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
