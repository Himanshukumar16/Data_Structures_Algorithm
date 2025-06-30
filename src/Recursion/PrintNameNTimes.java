package Recursion;
public class PrintNameNTimes {
    public static void main(String[] args) {
        PrintName r = new PrintName();
        r.recur(5);
    }
}
class PrintName {
    int num = 0;
    public void recur(int n){
        if(num == n){
            return;
        }
        System.out.println("Himanshu kumar!");
        num++;
        recur(n);
    }
}