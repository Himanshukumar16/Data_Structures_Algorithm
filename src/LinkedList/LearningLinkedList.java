package LinkedList;

public class LearningLinkedList {
    public void learningHowToMakeLinkedList(int[] arr, int key) {

        Node head = insert(arr);
        int length = 0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");// give all the content of the linked list.
            temp = temp.next;
            length++;
        }
        System.out.println();
        System.out.println(length);//give length of the linked list.

        //Search element in linked list.
        boolean isPresent = false;
        temp = head;
        while (temp != null) {
            if (temp.data == key) {
                isPresent = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println(isPresent);
    }

    private Node insert(int[] data) {
        Node head = new Node(data[0]);
        Node next = head;
        for (int i = 1; i < data.length; i++) {
            Node temp = new Node(data[i]);
            next.next = temp;
            next = temp;
        }
        return head;
    }
}

class Node {
    int data;
    Node next;

    public Node(int node) {
        this.data = node;
        this.next = null;
    }
}