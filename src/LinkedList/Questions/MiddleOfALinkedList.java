package LinkedList.Questions;

public class MiddleOfALinkedList {
    public void middleOfALinkedList(NodeForSLL head) {

//        TC -> O(n + n/2), SC -> O(1).

//        NodeForSLL temp = head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        temp = head;
//        int index = 1;
//        while (temp != null) {
//            if (count % 2 != 0) {
//                if ((count / 2) + 1 <= index) {
//                    System.out.println(temp.data);
////                    return;
//                }
//            } else {
//                if ((count / 2) + 1 <= index) {
//                    System.out.println(temp.data);
////                    return;
//                }
//            }
//            index++;
//            temp = temp.next;
//        }


//        Optimal Solution : TC -> O(n/2), SC -> O(1).

        NodeForSLL slow = head;
        NodeForSLL fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
