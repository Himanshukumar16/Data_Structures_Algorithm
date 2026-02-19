package LinkedList.DoublyLL;

public class DeleteANode {
    public void deleteANode(Node head, int k) {

//        Delete DLL Head.

//        Node temp = head;
//        head = head.next;
//        head.prev = null;
//        temp.next = null;


//        Delete tail of DLL.

//        Node temp = head;
//        if (head.next == null) {
//            System.out.println("null");
//            return;
//        }
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.prev.next = null;
//        temp.prev = null;


//        Delete kth element of the DLL.

//        Node temp = head;
//        int index = 1;
//        while (temp != null) {
//            if (index == k) break;
//            index++;
//            temp = temp.next;
//        }
//        Node pre = temp.prev;
//        Node front = temp.next;
//        if (pre == null && front == null) {
//            System.out.println("null");
//            return;
//        } if (pre == null) {
//            head = head.next;
//            head.prev = null;
//            temp.next = null;
//        } else if (front == null) {
//            temp.prev.next = null;
//            temp.prev = null;
//        } else {
//            temp.prev.next = temp.next;
//            temp.next.prev = temp.prev;
//            temp.next = null;
//            temp.prev = null;
//        }


//        Delete before kth node.(given node != head).

        Node temp = head;
        while (temp != null) {
            if (temp.data == k) break;
            temp = temp.next;
        }
        if (temp.next == null) {
            temp.prev.next = null;
            temp.prev.prev = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.prev = null;
            temp.next = null;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
