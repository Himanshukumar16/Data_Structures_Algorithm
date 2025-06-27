//check Palindrome number.
package BasicMaths;
public class Pallindrome {
    public static void main(String[] args) {
        int n = 5525;
        int rev = 0;
        int dup = n;
        while(dup >= 1){
            int last = dup % 10;
            rev = (rev * 10)+ last;
            dup = dup / 10;
        }
        System.out.println(rev == n);
    }
}
