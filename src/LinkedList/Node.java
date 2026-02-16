package LinkedList;

public class Node {
    int data;
    LinkedList.Node next;

    public Node(int node) {
        this.data = node;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}