package SelfPractice.GFG_Questions;

public class BasicMaths_1 {
    public int findSum(int n) {
        if(n == 1){
            return 1;
        }
        return n + findSum(n-1);
    }
}
