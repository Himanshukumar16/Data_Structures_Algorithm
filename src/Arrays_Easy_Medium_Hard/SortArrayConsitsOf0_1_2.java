package Arrays_Easy_Medium_Hard;

public class SortArrayConsitsOf0_1_2 {
    public void sortArrayConsitsOf0_1_2(int arr[]) {

//        Brute-Force TC -> O(nlogn), SC -> O(n)....

//        Better :

        int count1 = 0;
        int count2 = 0;
        int count0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
