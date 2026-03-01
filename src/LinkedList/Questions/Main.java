package LinkedList.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
//        MiddleOfALinkedList m = new MiddleOfALinkedList();
//        m.middleOfALinkedList(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))));

//        ReverseASLL r = new ReverseASLL();
//        r.reverseASLL(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))));

//        DetectALoopInLL d = new DetectALoopInLL();
//        d.detectALoopInLL(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))),40);

//        StartingNodeOfLoopForLL s = new StartingNodeOfLoopForLL();
//        s.startingNodeOfLoopForLL(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))));

//        LengthOfLoopInLL l = new LengthOfLoopInLL();
//        l.lengthOfLoopInLL(new NodeForSLL(33, new NodeForSLL(40, new NodeForSLL(52, new NodeForSLL(61)))));

//        PallindromeLL p = new PallindromeLL();
//        p.pallindromeLL(new NodeForSLL(11, new NodeForSLL(12, new NodeForSLL(12, new NodeForSLL(11)))));

//        OddEvenLL o = new OddEvenLL();
//        o.oddEvenLL(new NodeForSLL(11, new NodeForSLL(12, new NodeForSLL(13, new NodeForSLL(14, new NodeForSLL(15))))));

//        RemoveNodeFromEnd r = new RemoveNodeFromEnd();
//        r.removeNodeFromEnd(new NodeForSLL(11, new NodeForSLL(12, new NodeForSLL(13, new NodeForSLL(14, new NodeForSLL(15))))),5);

        DeleteMiddleNode d = new DeleteMiddleNode();
        d.deleteMiddleNode(new NodeForSLL(11, new NodeForSLL(12, new NodeForSLL(13, new NodeForSLL(14, new NodeForSLL(15))))));
    }
}