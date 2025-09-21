package Arrays_Easy_Medium_Hard;

public class SortArrayConsitsOf0_1_2 {
    public void sortArrayConsitsOf0_1_2(int arr[]) {

//        Brute-Force TC -> O(nlogn), SC -> O(n)...

//        Better :

//        int count1 = 0;
//        int count2 = 0;
//        int count0 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) count0++;
//            if (arr[i] == 1) count1++;
//            if (arr[i] == 2) count2++;
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        for (int i = count0; i < count0 + count1; i++) {
//            arr[i] = 1;
//        }
//        for (int i = count0 + count1; i < arr.length; i++) {
//            arr[i] = 2;
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }

//        Optimal : TC->O(),SC->O()...

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
