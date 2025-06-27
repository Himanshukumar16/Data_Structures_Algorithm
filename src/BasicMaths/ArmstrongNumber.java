//Armstrong Number
package BasicMaths;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 173;
        int n1 = 0;
        int dup = n;
        int arm = 0;
        while(dup >= 1){
            dup = dup/10;
            n1++;
        }
        dup = n;
        while(dup >= 1){
            int last = dup % 10;
            arm += (int)Math.pow(last,n1);
            dup = dup / 10;
        }
        System.out.println(arm == n);
    }
}
