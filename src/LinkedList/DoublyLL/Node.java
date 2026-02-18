package LinkedList.DoublyLL;

public class Node {

    Node prev;
    int data;
    Node next;

    public Node(){}

    public Node(Node pre, int data, Node next) {
        this.prev = pre;
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
        if (next != null) {
            next.prev = this;
        }
    }
}