package LinkedList.DoublyLL;

public class ArrayToLL {
    public void arrayToLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
