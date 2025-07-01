// Fibonnaci Series;
package Recursion;
public class FibonnaciSeries {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.recur(12));
    }
}
class Recursion{
    public int recur(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return (recur(n-1) + recur(n-2));
    }
}
