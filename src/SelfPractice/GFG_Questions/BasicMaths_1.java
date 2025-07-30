package SelfPractice.GFG_Questions;

public class BasicMaths_1 {
    public int findSum(int n) {
        SumN s = new SumN();
        return s.sumOfN(n);
    }
}
class SumN{
    public int sumOfN(int n) {
        if(n == 1){
            return 1;
        }
        return n + sumOfN(n-1);
    }
}
