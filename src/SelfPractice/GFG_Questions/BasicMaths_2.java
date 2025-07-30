package SelfPractice.GFG_Questions;

public class BasicMaths_2 {
    public void fibonacciNumbers(int n) {
        // Your code here
        int[]arr = new int[n];
        Fibo obj = new Fibo();
        for(int i = 0; i < n; i++){
            arr[i] = obj.fibonacci(i);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
class Fibo{
    public int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

