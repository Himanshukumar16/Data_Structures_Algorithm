package Arrays_Easy_Medium_Hard;

public class ReversePairs {
    public void reversePairs(int[] arr) {

//        Brute Force : TC -> O(n^2), SC -> O(1).

//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if ((long)arr[i] > 2L * arr[j]) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);


//        Optimal : TC -> O(nlogn), SC -> O(n).

        System.out.println(sort(arr, 0, arr.length - 1));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public int sort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += sort(arr, low, mid);
        count += sort(arr, mid + 1, high);
        count += count(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    public int count(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while ((long)right <= high && arr[i] > 2L * arr[right]) right++;
            count += right - (mid + 1);
        }
        return count;
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[index] = arr[left];
                index++;
                left++;
            } else {
                temp[index] = arr[right];
                right++;
                index++;
            }
        }
        while (left <= mid) {
            temp[index] = arr[left];
            index++;
            left++;
        }
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }
        System.arraycopy(temp, 0, arr, low, temp.length);
    }
}