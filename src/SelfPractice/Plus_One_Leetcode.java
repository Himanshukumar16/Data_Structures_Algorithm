package SelfPractice;
import java.util.*;
public class Plus_One_Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 19;
        int square = 0;
        int rev = 0;
        solve s = new solve();
        s.loop(n);
        while(square != 0){
            n = square;
            s.loop(n);
        }
        System.out.println(square==1);
    }
}
class solve{
    public int loop(int n) {
        int square = 0;
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            square += (int) Math.pow(last, 2);
            n = n / 10;
        }
        return n;
    }
}
