package LinkedList.Questions;

public class NodeForDLL {
    int data;
    NodeForDLL next;
    NodeForDLL prev;

    // DLL full node
    public NodeForDLL(NodeForDLL pre, int data, NodeForDLL next) {
        this.prev = pre;
        this.data = data;
        this.next = next;
    }

    // DLL single node
    public NodeForDLL(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    // DLL with next
    public NodeForDLL(int data, NodeForDLL next) {
        this.data = data;
        this.next = next;
        if (next != null) {
            next.prev = this;
        }
    }

    //DLL with empty node
    public NodeForDLL(){}
}