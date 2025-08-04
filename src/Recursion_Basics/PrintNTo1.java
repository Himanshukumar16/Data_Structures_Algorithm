// Print N To 1;
package Recursion_Basics;
public class PrintNTo1 {
    public static void main(String[] args) {
        PrintNT1 r = new PrintNT1();
        r.recur(1,5);
    }
}
class PrintNT1{
    public void recur(int i, int n){
        if(n < i){
            return;
        }
        System.out.println(n);
        recur(i,n-1);
    }
}
