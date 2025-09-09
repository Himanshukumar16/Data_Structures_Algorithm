package Arrays_Easy_Medium_Hard;

public class SearchInsertPosition {
    public void searchInsertPosition(int[]nums , int n){
        int i = 0;
        int ind = 0;
        while (i < nums.length) {
            if (nums[i] < n) {
                ind = i + 1;
            }
            if (nums[i] == n) ind = i;
            i++;
        }
        System.out.println(ind);
    }
}
