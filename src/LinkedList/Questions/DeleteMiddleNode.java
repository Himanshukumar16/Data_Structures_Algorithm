package LinkedList.Questions;

public class DeleteMiddleNode {
    public void deleteMiddleNode(NodeForSLL head) {

//        TC -> O(n + n/2), SC -> O(1).

        NodeForSLL temp = head;
//        int length = 0;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        temp = head;
//        int counter = 1;
//        int middle = (length / 2);
//        while (temp.next != null) {
//            if (counter == middle) {
//                temp.next = temp.next.next;
//            }
//            counter++;
//            temp = temp.next;
//        }


//        TC -> O(n/2), SC -> O(1).

        NodeForSLL fastPtr = head;
        NodeForSLL slowPtr = head;
        fastPtr = fastPtr.next.next;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = slowPtr.next.next;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
