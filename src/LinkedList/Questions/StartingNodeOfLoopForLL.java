package LinkedList.Questions;

import java.util.*;

public class StartingNodeOfLoopForLL {
    public void startingNodeOfLoopForLL(NodeForSLL head) {

//        TC -> O(n), SC -> O(n).

//        Map<NodeForSLL, Integer> map = new HashMap<>();
//        NodeForSLL temp = head;
//        while (temp != null) {
//            if (map.containsKey(temp)) {
//                System.out.println(true);
//            }
//            map.put(temp, 1);
//            temp = temp.next;
//        }
//        System.out.println("null");

//        TC -> O(n), SC -> O(1).

        NodeForSLL slow = head;
        NodeForSLL fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(fast);
            }
        }
        System.out.println("null");
    }
}
