package LinkedList.Questions;

public class Add1ToLL {
    public void add1Toll(NodeForSLL head) {

//        TC -> O(n), SC -> O(1).

        NodeForSLL temp = head;
//        NodeForSLL revList = reverse(temp);
//        NodeForSLL temp2 = revList;
//        int carry = 1;
//        while (revList != null) {
//            revList.data = revList.data + carry;
//            if (revList.data == 10) {
//                revList.data = 0;
//            } else {
//                carry = 0;
//                break;
//            }
//            revList = revList.next;
//        }
//        temp = reverse(temp2);
//        if (carry == 1) {
//            NodeForSLL newNode = new NodeForSLL(1);
//            newNode.next = temp;
//            head = newNode;
//        }


//        TC -> O(n), SC -> O(n) : due to recursive stack. by recursion.

        int carry = lastNode(head);
        if (carry == 1) {
            NodeForSLL newNode = new NodeForSLL(1);
            newNode.next = head;
            head = newNode;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private int lastNode(NodeForSLL temp) {
        if (temp == null) return 1;
        int carry = lastNode(temp.next);
        temp.data = temp.data + carry;
        if (temp.data == 10) {
            temp.data = 0;
            carry = 1;
        } else return 0;
        return carry;
    }

    private NodeForSLL reverse(NodeForSLL temp) {
        NodeForSLL pre = null;
        NodeForSLL cur = temp;
        NodeForSLL post = null;

        while (cur != null) {
            post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
        return pre;
    }
}
