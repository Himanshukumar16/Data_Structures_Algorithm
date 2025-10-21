package Arrays_Easy_Medium_Hard;

public class SecondLargestElementInArray {
    public void secondLargest(int[] arr) {
//        brute force approach -> sort then get largest element by last index. tc -> O(NlogN + N).

//        TC -> O(2n). (Better approach.)

        int slarge = Integer.MIN_VALUE;
        int large = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > large) large = arr[i];
//        }
//        for (int i = 0; i < arr.length ; i++){
//            if(arr[i] > slarge && arr[i] != large ) slarge = arr[i];
//        }
//        System.out.println("Second Largest Number In The Array Is : "+slarge);

//        TC -> O(n) (Optimal approach.)

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                slarge = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > slarge) slarge = arr[i];
        }

        if(slarge == Integer.MIN_VALUE) System.out.println(-1);
        System.out.println("Second Largest Number In The Array Is : " + slarge);
    }
}
