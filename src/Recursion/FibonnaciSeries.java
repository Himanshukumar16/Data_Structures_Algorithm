// Fibonnaci Series;
package Recursion;
public class FibonnaciSeries {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.recur(4));
    }
}
class Recursion{
    public int recur(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return (recur(n-1) + recur(n-2));
    }
}
