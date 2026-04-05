package LinkedList.Questions;

public class SortLLOf012 {
    public void sortLLOf012(NodeForSLL head) {

//        brute -> TC -> O(2n), SC O(1).

//        NodeForSLL temp = head;
//        int cnt0 = 0;
//        int cnt1 = 0;
//        int cnt2 = 0;
//        while (temp != null) {
//            if (temp.data == 0) cnt0++;
//            if (temp.data == 1) cnt1++;
//            if (temp.data == 2) cnt2++;
//            temp = temp.next;
//        }
//        temp = head;
//        for (int i = 0; i < cnt0; i++) {
//            temp.data = 0;
//            temp = temp.next;
//        }
//        for (int i = 0; i < cnt1; i++) {
//            temp.data = 1;
//            temp = temp.next;
//        }
//        for (int i = 0; i < cnt2; i++) {
//            temp.data = 2;
//            temp = temp.next;
//        }

//        optimal : TC -> O(n), SC -> O(1).

        NodeForSLL temp = head;
        NodeForSLL dummy0 = new NodeForSLL(-1);
        NodeForSLL dummy1 = new NodeForSLL(-1);
        NodeForSLL dummy2 = new NodeForSLL(-1);
        NodeForSLL temp0 = dummy0;
        NodeForSLL temp1 = dummy1;
        NodeForSLL temp2 = dummy2;

        while (temp != null) {
            if (temp.data == 0) {
                temp0.next = temp;
                temp0 = temp;
            }
            if (temp.data == 1) {
                temp1.next = temp;
                temp1 = temp;
            }
            if (temp.data == 2) {
                temp2.next = temp;
                temp2 = temp;
            }
            temp = temp.next;
        }
        temp0.next = dummy1.next;
        if (temp1.data == -1) temp0.next = dummy2.next;
        else temp1.next = dummy2.next;
        temp2.next = null;

//        for printing :->
        temp = dummy0.next;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}