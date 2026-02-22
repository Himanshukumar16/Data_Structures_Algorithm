package LinkedList.DoublyLL;

public class ReverseADll {
    public void reverseADll(Node head) {

//        TC -> O(n), SC -> O(n).

//        Node temp = head;
//        Stack<Integer> nodesValue = new Stack<>();
//        while (temp != null) {
//            nodesValue.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while (temp != null) {
//            temp.data = nodesValue.pop();
//            temp = temp.next;
//        }


//        TC -> O(n), SC -> O(1).

        Node temp = head;
        Node last = null;
        if (head == null || head.next == null) return;
        while (temp != null) {
            last = temp.prev;
            temp.prev = temp.next;
            temp.next = last;
            temp = temp.prev;
        }
        head = last.prev;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
