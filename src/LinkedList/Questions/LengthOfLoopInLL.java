package LinkedList.Questions;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLoopInLL {
    public void lengthOfLoopInLL(NodeForSLL head) {
//        For loop questions refer to gfg or leetcode question to check whether it is correct or not.
//        replace System.out.println() with return.

//        TC - > O(n), SC -> O(n).

//        Map<NodeForSLL, Integer> map = new HashMap<>();
//        NodeForSLL temp = head;
//        int length = 1;
//        while (temp != null) {
//            if (map.containsKey(temp)) System.out.println(length - map.get(temp));
//            map.put(temp, length);
//            length++;
//            temp = temp.next;
//        }


//        TC - > O(n), SC -> O(1).

        NodeForSLL slow = head;
        NodeForSLL fast = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = slow.next;
                length += 1;
                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                System.out.println(length);
            }
        }
        System.out.println(0);
    }
}
