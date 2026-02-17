package LinkedList.SinglyLL;

public class DeleteANode {
    public void deleteANode(Node head,int k) {

//        delete head.

//        head = head.next;
//        System.out.println(head.data);



//        delete tail.

//        Node temp = head;
//        if (head.next == null) System.out.println("null");
//        while (temp.next.next != null) {
//            temp = temp.next;
//        }
//        temp.next = null;



//        delete kth element of linked list.

//        Node temp = head;
//        if (head == null) return;
//        if (k == 0) {
//            head = head.next;
//            return;
//        }
//        int count = 0;
//        while (temp != null) {
//            if (count == k - 1 && temp.next != null) {
//                temp.next = temp.next.next;
//                break;
//            }
//            count++;
//            temp = temp.next;
//        }



//        delete by value given as input only.

        Node temp = head;
        if (head == null) return;
        while (temp.next != null) {
            if (head.data == k) {
                head = head.next;
                break;
            }
            if (temp.next.data == k) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // give all the content of the linked list.
            temp = temp.next;
        }
    }
}