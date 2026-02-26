package LinkedList.Questions;

public class ReverseASLL {
    public void reverseASLL(NodeForSLL head) {

//        with iteration :->

//        TC -> O(n), SC -> O(n).

//        Stack<Integer> stack = new Stack<>();
        NodeForSLL temp = head;
//        while (temp != null) {
//            stack.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while (temp != null) {
//            temp.data = stack.pop();
//            temp = temp.next;
//        }


//        TC -> O(n), SC -> O(1).

//        NodeForSLL front = null;
//        NodeForSLL pre = null;
//        while (temp != null) {
//            front = temp.next;
//            temp.next = pre;
//            pre = temp;
//            temp = front;
//        }
//        head = pre;

        head = reverseUsingRecursion(head);

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // give all the content of the linked list.
            temp = temp.next;
        }
    }

    public NodeForSLL reverseUsingRecursion(NodeForSLL head) {
        if (head.next == null || head == null) {
            return head;
        }
        NodeForSLL newHead = reverseUsingRecursion(head.next);
        NodeForSLL front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
