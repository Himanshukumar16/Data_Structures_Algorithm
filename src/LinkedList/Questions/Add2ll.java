package LinkedList.Questions;

public class Add2ll {
    public void add2ll(NodeForSLL l1, NodeForSLL l2) {

        NodeForSLL dummy = new NodeForSLL(-1);
        NodeForSLL temp = dummy;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int sum = carry;
            sum += l1.data;
            sum += l2.data;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            temp.next = new NodeForSLL(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        temp = dummy.next;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (l1 != null) {
            if (l1.data + carry >= 10) {
                l1.data = (l1.data + carry) % 10;
                temp.next = new NodeForSLL(l1.data);
                carry = 1;
            } else {
                temp.next = new NodeForSLL(l1.data + carry);
                carry = 0;
            }
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            if (l2.data + carry >= 10) {
                l2.data = (l2.data + carry) % 10;
                temp.next = new NodeForSLL(l2.data);
                carry = 1;
            } else {
                temp.next = new NodeForSLL(l2.data + carry);
                carry = 0;
            }
            temp = temp.next;
            l2 = l2.next;
        }

        if (carry == 1) {
            temp.next = new NodeForSLL(1);
        }

        temp = dummy.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
