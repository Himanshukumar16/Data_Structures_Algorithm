package Arrays;

public class GcdOfOddAndEven {
    public void gcdOfOddAndEven(int n){

//      Brute-Force Approach : TC-> O(n).

        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= 2 * n; i++){
            if(i % 2 != 0){
                sumOdd += i;
            }else{
                sumEven += i;
            }
        }
        while(sumOdd != 0 && sumEven != 0){
            if(sumOdd > sumEven) sumOdd = sumOdd % sumEven;
            else sumEven = sumEven % sumOdd;
        }
        int out = (sumOdd == 0) ? sumEven : sumOdd;
        System.out.println(out);


//      Optimal Approach : TC-> O(1).

//        System.out.println(n);

    }
}
