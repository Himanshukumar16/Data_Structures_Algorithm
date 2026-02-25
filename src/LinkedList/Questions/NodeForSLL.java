package LinkedList.Questions;

public class NodeForSLL {

    int data;
    NodeForSLL next;

    // SLL node
    public NodeForSLL(int data) {
        this.data = data;
        this.next = null;
    }

    // SLL with next
    public NodeForSLL(int data, NodeForSLL next) {
        this.data = data;
        this.next = next;
    }

    //SLL with empty node
    public NodeForSLL(){}
}
