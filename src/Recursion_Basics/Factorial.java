// Factorial of a number;
package Recursion_Basics;
public class Factorial {
    public static void main(String[] args) {
        FOAN fact = new FOAN();
        System.out.println(fact.recur(4));
    }
}
class FOAN{
    public int recur(int n){
        if(n == 1){
            return 1;
        }
        return n * recur(n-1);
    }
}