package Properties.LinkedList;

import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
       /* SinglyLinkedLIst singlyLinkedLIst=new SinglyLinkedLIst();
        singlyLinkedLIst.insertFirst(4);
        singlyLinkedLIst.insertFirst(14);

        singlyLinkedLIst.insertFirst(5);
        singlyLinkedLIst.insertFirst(1);
        singlyLinkedLIst.insertFirst(12);
        singlyLinkedLIst.insertFirst(7);

        singlyLinkedLIst.display();
        singlyLinkedLIst.insertLast(99);
        singlyLinkedLIst.display();
        System.out.println(singlyLinkedLIst.deleteFirst());
        singlyLinkedLIst.display();

        System.out.println(singlyLinkedLIst.deleteLast());
        singlyLinkedLIst.display();

        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertFirst(18);

        */

        CircularLinkedList cll= new CircularLinkedList();

        cll.insertValue(23);
        cll.insertValue(12);
        cll.insertValue(2);
        cll.insertValue(3);
        cll.insertValue(13);
        cll.insertValue(32);
        cll.insertValue(64);

        cll.display();
        cll.delete(32);
        cll.display();

    }
}
