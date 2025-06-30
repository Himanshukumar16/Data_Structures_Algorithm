// print 1 to n by backtracking.
package Recursion;
public class Backtracking_1 {
    public static void main(String[] args) {
        Back_01 b = new Back_01();
        b.recur(1,10);
    }
}
class Back_01{
    public void recur(int i , int n){
        if(n < i){
            return;
        }
        recur(i,n-1);
        System.out.println(n);
    }
}
