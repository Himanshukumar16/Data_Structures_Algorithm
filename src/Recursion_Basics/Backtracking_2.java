// print n to 1 by backtracking.
package Recursion_Basics;
public class Backtracking_2 {
    public static void main(String[] args) {
        Back_02 b = new Back_02();
        b.recur(1,10);
    }
}
class Back_02{
    public void recur(int i, int n){
        if(i > n){
            return;
        }
        recur(i+1,n);
        System.out.println(i);
    }
}