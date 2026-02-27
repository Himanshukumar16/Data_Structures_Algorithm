package LinkedList.Questions;

import java.util.Stack;

public class PallindromeLL {
    public void pallindromeLL(NodeForSLL head) {

//        Tc -> O(n), SC -> O(n).

//        boolean isPallindrome = true;
//        Stack<Integer> nodeData = new Stack<>();
//        NodeForSLL temp = head;
//        while (temp != null) {
//            nodeData.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while (temp != null) {
//            int data = nodeData.pop();
//            if (data != temp.data) isPallindrome = false;
//            temp = temp.next;
//        }
//        System.out.println(isPallindrome);


//        Tc -> O(n), SC -> O(1).

        if (head == null || head.next == null) System.out.println(true);
        NodeForSLL fast = head;
        NodeForSLL slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        NodeForSLL newHead = reverse(slow.next);
        NodeForSLL ptr1 = head;
        NodeForSLL ptr2 = newHead;
        while (ptr2 != null) {
            if (ptr1.data != ptr2.data) {
                System.out.println(false);
                return;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        System.out.println(true);
    }

    private NodeForSLL reverse(NodeForSLL head) {
        NodeForSLL temp = head;
        NodeForSLL pre = null;
        NodeForSLL front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;
        }
        return pre;
    }
}