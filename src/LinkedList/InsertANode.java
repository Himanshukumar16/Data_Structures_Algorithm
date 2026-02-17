package LinkedList;

public class InsertANode {
    public void insertANode(Node head, int data, int position) {

//        Insert at head.

//        Node temp = new Node(data);
//        temp.next = head;
//        head = temp;



//        Insert at end of linked list.

//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        Node newNode = new Node(data);
//        temp.next = newNode;



//        Insert at given index of linked list.

//        Node temp = head;
//        Node newNode = new Node(data);
//        if (head == null && position == 1) {
//            head = newNode;
//        }
//        if (position == 1) {
//            newNode.next = head;
//            head = newNode;
//        }
//        int count = 1;
//        while (temp != null) {
//            if (count == position - 1) {
//                newNode.next = temp.next;
//                temp.next = newNode;
//            }
//            count++;
//            temp = temp.next;
//        }



//        Insert before the given node.

        Node temp = head;
        Node newNode = new Node(data);
        while (temp != null) {
            if (head.data == position) {
                newNode.next = head;
                head = newNode;
                break;
            }
            if (temp.next.data == position) {
                newNode.next = temp.next;
                temp.next = newNode;
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
