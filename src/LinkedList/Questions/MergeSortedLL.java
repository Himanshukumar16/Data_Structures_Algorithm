package LinkedList.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedLL {

    public void mergeSortesLL(NodeForSLL head1, NodeForSLL head2){

        ArrayList<Integer> array = new ArrayList<>();
        NodeForSLL temp1 = head1;
        NodeForSLL temp2 = head2;
        while (temp1 != null) {
            array.add(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            array.add(temp2.data);
            temp2 = temp2.next;
        }
        sort(array,0,array.size()- 1);
        System.out.println(array);

    }
    private void sort(List<Integer> arr, int low, int high) {

        if (low >= high) return;

        int mid = (low + high) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(List<Integer> arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        int i = 0;

        int[] tempArr = new int[arr.size()];

        while (left <= mid && right <= high) {
            if (arr.get(left) < arr.get(right)) {
                tempArr[i] = arr.get(left);
                left++;
            } else {
                tempArr[i] = arr.get(right);
                right++;
            }
            i++;
        }

        while (left <= mid) {
            tempArr[i] = arr.get(left);
            i++;
            left++;
        }

        while (right <= high) {
            tempArr[i] = arr.get(right);
            i++;
            right++;
        }

        for (int j = low; j <= high; j++) {
            arr.set(j, tempArr[j - low]);
        }
    }
}