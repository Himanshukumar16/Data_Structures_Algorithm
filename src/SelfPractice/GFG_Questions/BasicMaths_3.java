package SelfPractice.GFG_Questions;

public class BasicMaths_3 {
    public void gcdAndLcm() {
        int[] arr = new int[2];
        int a = 10 , b = 20;
        while(a !=0 && b !=0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        arr[1] = Math.max(a,b);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

