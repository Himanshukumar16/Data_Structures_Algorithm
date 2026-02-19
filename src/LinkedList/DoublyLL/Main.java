package LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {

//        ArrayToLL a = new ArrayToLL();
//        a.arrayToLL(new int[]{11,22,33,44,55});

//        DeleteANode d = new DeleteANode();
//        d.deleteANode(new Node(2, new Node(4, new Node(5, new Node(6, new Node(7, new Node(8)))))), 9);

        InsertANode i = new InsertANode();
        i.insertANode(new Node(2, new Node(4, new Node(5, new Node(6, new Node(7, new Node(8)))))),10, 1);
    }
}
