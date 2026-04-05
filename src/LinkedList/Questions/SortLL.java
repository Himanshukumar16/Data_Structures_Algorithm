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

//        optimal :-> TC -> O(n log n), SC -> O(log n).

        NodeForSLL temp = head;
        divide(temp);


//        for printing :->

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private NodeForSLL divide(NodeForSLL head) {
        if (head == null || head.next == null) return head;

        NodeForSLL middle = findMiddle(head);
        NodeForSLL rightHead = middle.next;
        middle.next = null;

        NodeForSLL left = divide(head);// left side divide.
        NodeForSLL right = divide(rightHead);// right side divide.

        return merge(left,right); // merge list.
    }

    private NodeForSLL merge(NodeForSLL left, NodeForSLL right) {
        NodeForSLL dummy = new NodeForSLL(-1);
        NodeForSLL temp = dummy;
        NodeForSLL temp1 = left;
        NodeForSLL temp2 = right;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 != null) temp.next = temp1;
        else temp.next = temp2;
        return dummy.next;
    }

    private NodeForSLL findMiddle(NodeForSLL head) {
        NodeForSLL fast = head.next;
        NodeForSLL slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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