package LinkedList.Questions;

import java.util.HashMap;
import java.util.Map;

public class DetectALoopInLL {
    public void detectALoopInLL(NodeForSLL head, int pos) {

//        TC -> O(n), SC -> O(n).

//        Map<NodeForSLL, Integer> map = new HashMap<>();
//        NodeForSLL temp = head;
//        boolean isLoopPresent = false;
//        while (temp != null) {
//            if (map.containsKey(temp)) {
//                isLoopPresent = true;
//            }
//            map.put(temp, map.getOrDefault(temp, 0) + 1);
//            temp = temp.next;
//        }
//        if (isLoopPresent) System.out.println(temp);
//        else System.out.println(-1);


//        TC -> O(n), SC -> O(1).

        NodeForSLL slowPtr = head;
        NodeForSLL fastPtr = head;
        boolean isLoopPresent = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) isLoopPresent = true;
        }
        System.out.println(isLoopPresent);
    }
}