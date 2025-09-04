package Arrays;

public class NumberAppearence {
    public void numberAppearence(int[]arr) {

//        Brute-Force Approach : TC -> O(n^2), SC -> O(1)...

        for (int check : arr) {
            int count = 0;
            for (int k : arr) {
                if (check == k) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(check);
                break;
            }
        }

//        Better Solution : TC -> O(), SC -> O()... (Only if Array is sorted.)


    }
}
