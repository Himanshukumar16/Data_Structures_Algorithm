package LinkedList.Questions;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfAll {
    public void intersectionOfAll(NodeForSLL head1, NodeForSLL head2) {

//        TC -> O(n1+n2), SC -> O(n1).

//        NodeForSLL temp1 = head1;
//        NodeForSLL temp2 = head2;
//
//        Map<NodeForSLL, Integer> map = new HashMap<>();
//
//        while (temp1 != null) {
//            map.put(temp1, 1);
//            temp1 = temp1.next;
//        }
//
//        while (temp2 != null) {
//            if (map.containsKey(temp2)) {
//                System.out.println(temp2.data);
//                return;
//            }
//            temp2 = temp2.next;
//        }
//        System.out.println("null");

//        optimal: TC -> O(n1+n2), SC -> O(1).

        int lengthOf1 = 0;
        int lengthOf2 = 0;
        NodeForSLL temp1 = head1;
        NodeForSLL temp2 = head2;

        while (temp1 != null) {
            lengthOf1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            lengthOf2++;
            temp2 = temp2.next;
        }

        if (lengthOf1 < lengthOf2) {
            System.out.println(collisionPoint(head1, head2, lengthOf2 - lengthOf1));
        } else System.out.println(collisionPoint(head2, head1, lengthOf1 - lengthOf2));
    }

    private NodeForSLL collisionPoint(NodeForSLL back, NodeForSLL front, int difference) {

        for (int i = 0; i < difference; i++) {
            back = back.next;
        }
        while (front != back) {
            front = front.next;
            back = back.next;
        }
        return back;
    }
}
