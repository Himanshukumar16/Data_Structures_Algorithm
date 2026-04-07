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

//        TC -> O(n1+n2), SC -> O(1).

//        int lengthOf1 = 0;
//        int lengthOf2 = 0;
//        NodeForSLL temp1 = head1;
//        NodeForSLL temp2 = head2;
//
//        while (temp1 != null) {
//            lengthOf1++;
//            temp1 = temp1.next;
//        }
//
//        while (temp2 != null) {
//            lengthOf2++;
//            temp2 = temp2.next;
//        }
//
//        if (lengthOf1 < lengthOf2) {
//            System.out.println(collisionPoint(head1, head2, lengthOf2 - lengthOf1));
//        } else System.out.println(collisionPoint(head2, head1, lengthOf1 - lengthOf2));

//        Tc -> O(n1+n2), SC -> O(1).

        NodeForSLL temp1 = head1;
        NodeForSLL temp2 = head2;

        while (temp1 !=  temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == temp2) {
                System.out.println(temp1);
                return;
            }
            if (temp1 == null) temp1 = head2;
            if (temp2 == null) temp2 = head1;

        }
        System.out.println(temp1);
    }

    private NodeForSLL collisionPoint(NodeForSLL smallerList, NodeForSLL biggerList, int difference) {

        for (int i = 0; i < difference; i++) {
            biggerList = biggerList.next;
        }
        while (smallerList != biggerList) {
            biggerList = biggerList.next;
            smallerList = smallerList.next;
        }
        return smallerList;
    }
}
