// Count digits in a number:
package BasicMaths;
public class CountDigit {
    public static void main(String[] args) {
        int n = 5235;
        int num = 0;
        while(n >= 1){
            n = n / 10;
            num++;
        }
        System.out.println(num);
    }
}
