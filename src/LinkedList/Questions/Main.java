package LinkedList.Questions;

public class Main {
    public static void main(String[] args) {
        
        MiddleOfALinkedList m = new MiddleOfALinkedList();
        m.middleOfALinkedList(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))));
    }
}