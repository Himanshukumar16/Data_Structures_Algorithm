// Prime number or not
package BasicMaths;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean out = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                out = false;
            }
        }if(n == 1 || n == 0){
            System.out.println("Neither even nor odd !");
        }else{
            System.out.println(out);
        }
    }
}
