// GCD or HCF.
package BasicMaths;
public class GCDorHCF {
    public static void main(String[] args) {
        int a = 20;
        int b = 54;
        while(a > 0 && b > 0){
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        System.out.println(Math.max(a,b));
    }
}
