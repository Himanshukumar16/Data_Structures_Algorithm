package LinkedList.SinglyLL;

public class Node {
    int data;
    Node next;

    public Node(int node) {
        this.data = node;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}