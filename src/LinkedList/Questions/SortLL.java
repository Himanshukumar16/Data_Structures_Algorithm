package LinkedList.Questions;

import java.util.*;

public class SortLL {
    public void sortLL(NodeForSLL head) {

//        TC -> O(n log n), SC -> O(n).

//        List<Integer> lst = new ArrayList<>();
//        NodeForSLL temp = head;
//        while (temp != null) {
//            lst.add(temp.data);
//            temp = temp.next;
//        }
//
//        sort(lst, 0, lst.size() - 1);
//
//        int index = 0;
//        temp = head;
//        while (temp != null) {
//            temp.data = lst.get(index);
//            index++;
//            temp = temp.next;
//        }


//        TC -> O(n log n), SC -> O(n).

        NodeForSLL temp = head;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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