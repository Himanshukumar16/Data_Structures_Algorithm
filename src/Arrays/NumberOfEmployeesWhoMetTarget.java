package Arrays;

public class NumberOfEmployeesWhoMetTarget {
    public void numberOfEmployeesWhoMetTarget(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num >= target) count++;
        }
        System.out.println(count);
    }
}
