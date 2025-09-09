package Arrays_Basics_Easy;
public class MissingValue {
    public void missingValue(int[] arr) {

//        Brute-Force : TC -> O(n^2), SC -> O(1)...

//        int count = 0;
//        for (int i = 0; i <= arr.length; i++) {
//            for (int k : arr) {
//                if (i == k) {
//                    count = 1;
//                    break;
//                } else count = 0;
//            }
//            if (count == 0) {
//                System.out.println(i);
//            }
//        }


//        Better solution : TC -> O(n), SC -> O(n)...

//        int[] hash = new int[arr.length + 1];
//        for (int k : arr) {
//            hash[k] += 1;
//        }
//        int ind = 0;
//        for(int i : hash){
//            if(i == 0) {
//                System.out.println(ind);
//            }
//            ind++;
//        }


//        Optimal Solution - 1 : TC -> O(n), SC -> O(1)...

        int sum = 0;
        int n = arr.length;
        int total = (n * (n+1)) / 2;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(total-sum);


//        Optimal Solution 2 : TC -> O(), SC -> O()...

//        int xor1 = 0;
//        int xor2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            xor2 = xor2 ^ arr[i];
//            xor1 = xor1 ^ (i + 1);
//        }
//        System.out.println(xor1 ^ xor2);

    }
}
