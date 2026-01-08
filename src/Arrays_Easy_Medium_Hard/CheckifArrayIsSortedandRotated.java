package Arrays_Easy_Medium_Hard;

public class CheckifArrayIsSortedandRotated {
    public void checkifArrayIsSortedandRotated(int[] nums) {

//        unprofessional method not readable :

//        int breakPoint = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] > nums[i + 1]) {
//                breakPoint++;
//            }
//        }
//        System.out.println((breakPoint == 1 && nums[0] > nums[nums.length - 1]) || (breakPoint == 0 && nums[0] < nums[nums.length - 1]));

//        readable :

        int breakPoint = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                breakPoint++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            breakPoint++;
        }
        System.out.println(breakPoint <= 1);
    }
}
