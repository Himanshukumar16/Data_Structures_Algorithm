// Sum Of First N Numbers
package Recursion_Basics;
public class SumOfFirstNNumbers {
    public static void main(String[] args) {

        SOFNN s = new SOFNN();
        System.out.println(s.recur(10));

    }
}
class SOFNN{

//        1st method:-

    public int recur(int i, int sum){
        if(i < 1){
            return sum;
        }
        return recur(i-1,sum+i);
    }

//        2nd method :-

    public int recur(int i){
        if(i < 1){
            return 0;
        }
        return i+recur(i-1);
    }
}