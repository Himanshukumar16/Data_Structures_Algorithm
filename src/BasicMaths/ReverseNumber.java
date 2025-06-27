//Reverse digits
package BasicMaths;
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5632;
        int rev = 0;
        int dup = n;
        while(dup >= 1){
            int last = dup % 10;
            rev = (rev * 10)+ last;
            dup = dup / 10;
        }
        System.out.println(rev);
    }
}
