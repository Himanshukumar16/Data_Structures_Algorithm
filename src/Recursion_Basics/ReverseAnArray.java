// Reverse An Array
package Recursion_Basics;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Raa r = new Raa();
        r.reccur(0, arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
class Raa{
    public void reccur(int i,int[]a){
        if(i >= (a.length - i - 1)){
            return;
        }
        int temp = a[i];
        a[i] = a[(a.length - i - 1)];
        a[(a.length - i - 1)] = temp;
        reccur(i+1,a);
    }
}
