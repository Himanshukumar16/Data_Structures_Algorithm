package LinkedList.DoublyLL;

public class InsertANode {
    public void insertANode(Node head, int data, int position) {

//        Insert at head.

//        Node temp = new Node(data);
//        temp.next = head;
//        head.prev = temp;
//        head = temp;


//        Insert at tail.

//        head = insertAtTail(head, data);


//        Insert at given position.

//        Node temp = head;
//        Node newNode = new Node(data);
//        int index = 1;
//        while (temp != null) {
//            if (index == position) {
//                break;
//            }
//            index++;
//            temp = temp.next;
//        }
//        if (position == 1) {
//            newNode.next = head;
//            head.prev = newNode;
//            head = newNode;
//        } else if (temp == null) {
//            insertAtTail(head, data);
//        } else {
//            temp.prev.next = newNode;
//            newNode.next = temp;
//            newNode.prev = temp.prev;
//            temp.prev = newNode;
//        }


//        Insert at given node.

        Node temp = head;
        Node newNode = new Node(data);
        while (temp.next != null) {
            if (temp.data == position) {
                break;
            }
            temp = temp.next;
        }
        if (temp.prev == null && temp.data == position) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        if (temp.next == null && temp.data == position) {
            temp.prev.next = newNode;
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev = newNode;
        }
        else if (temp.data == position){
            temp.prev.next = newNode;
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev = newNode;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
}