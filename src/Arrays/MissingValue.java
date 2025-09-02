package Arrays;
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


//        Optimal Solution : TC -> O(), SC -> O()...


    }
}
