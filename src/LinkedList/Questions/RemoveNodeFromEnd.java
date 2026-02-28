package LinkedList.Questions;

public class RemoveNodeFromEnd {
    public void removeNodeFromEnd(NodeForSLL head, int n) {

//        Better/ Brute : TC -> O(n), SC -> O(1).

        NodeForSLL temp = head;
//        int length = 0;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        temp = head;
//        int counter = 1;
//        if (n == length) temp = head.next;
//        while (temp != null && temp.next != null) {
//            if (counter == length - n) {
//                temp.next = temp.next.next;
//            }
//            temp = temp.next;
//            counter++;
//        }


//        Optimal : TC -> O(n), SC -> O(1).

        NodeForSLL fastPtr = head;
        NodeForSLL slowPtr = head;
        for (int i = 0; i < n; i++) {
            fastPtr = fastPtr.next;
        }
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        if (fastPtr == null) temp = head.next;
        slowPtr.next = slowPtr.next.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
