// Print Name N Times
package Recursion;
public class PrintNameNTimes {
    public static void main(String[] args) {
        PrintName r = new PrintName();
        r.recur(5);
    }
}
class PrintName {
    public void recur(int n){
        if(0 == n){
            return;
        }
        System.out.println("Himanshu kumar!");
        recur(n-1);
    }
}