// counting 1 to n
package Recursion;
public class Print1ToN {
    public static void main(String[] args) {
        Print1TN count = new Print1TN();
        count.recur(1,5);
    }
}
class Print1TN{
    public void recur(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        recur(i+1,n);
    }
}
