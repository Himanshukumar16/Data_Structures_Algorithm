package SelfPractice;
import java.util.*;
public class Plus_One_Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "yes";
        while (t > 0) {
            int avg = 0;
            int count = 0;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                count++;
                if (i == 1 && a < 40) {
                    s = "No";
                    break;
                }
                avg += a;
                System.out.println("count"+count);
                System.out.println("avg"+avg);
            }
            t--;
            if((avg/count) >= 40) {
                s = "Yes";
            }else{
                s = "no";
            }
            System.out.println(s);

        }
    }
}
//4
//        2
//        0 100
//        3
//        41 39 40
//        4
//        41 41 28 100
//        1
//        100