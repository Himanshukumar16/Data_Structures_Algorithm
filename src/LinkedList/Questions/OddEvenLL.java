package LinkedList.Questions;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLL {
    public void oddEvenLL(NodeForSLL head) {

//        Tc -> O(n), SC -> O(n).

//        if (head == null || head.next == null) System.out.println("null");
//        List<Integer> lst = new ArrayList<>();
//        NodeForSLL temp = head;
//        while (temp != null && temp.next != null) {
//            lst.add(temp.data);
//            temp = temp.next.next;
//        }
//        if (temp  != null) lst.add(temp.data);
//        temp = head.next;
//        while (temp != null && temp.next != null) {
//            lst.add(temp.data);
//            temp = temp.next.next;
//        }
//        if (temp  != null) lst.add(temp.data);
//        temp = head;
//        int index = 0;
//        while (temp != null) {
//            temp.data = lst.get(index);
//            index++;
//            temp = temp.next;
//        }

//        temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

//        Tc -> O(n), SC -> O(1).

        if (head == null || head.next == null) System.out.println(head);
        NodeForSLL odd = head;
        NodeForSLL even = head.next;
        NodeForSLL evenHead = even;
        while (even != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        NodeForSLL temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}