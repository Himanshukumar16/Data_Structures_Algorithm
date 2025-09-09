package Arrays_Basics_Easy;

public class RestoreFinishingOrder {
    public void restoreFinishingOrder(int [] order , int[]friends){
        int[] arr = new int[friends.length];
        int ind = 0;
        for (int k : order) {
            for (int friend : friends) {
                if (k == friend) {
                    arr[ind] = k;
                    ind++;
                    break;
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
