package LinkedList.DoublyLL;

public class InsertANode {
    public void insertANode(Node head, int data, int position) {

//        Insert at head.

//        Node temp = new Node(data);
//        temp.next = head;
//        head.prev = temp;
//        head = temp;


//        Insert at tail.

//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        }
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//        newNode.prev = temp;


//        Insert at given position.

        Node temp = head;
        Node newNode = new Node(data);
        int index = 1;
        while (temp != null) {
            if (index == position) {
                break;
            }
            index++;
            temp = temp.next;
        }
        Node previous = temp.prev;
        Node front = temp.next;
        if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}