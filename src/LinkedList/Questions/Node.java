package LinkedList.Questions;

public class Node {

    Node prev;
    int data;
    Node next;

    public void emptyNode(){}

    public void dllNode(Node pre, int data, Node next) {
        this.prev = pre;
        this.data = data;
        this.next = next;
    }

    public void dllNode(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    public void dllNode(int data, Node next) {
        this.data = data;
        this.next = next;
        if (next != null) {
            next.prev = this;
        }
    }

    public void llNode(int node) {
        this.data = node;
        this.next = null;
    }

    public void llNode(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}